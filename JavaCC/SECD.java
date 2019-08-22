import java.util.LinkedList;
import java.util.Stack;

public class SECD {
	
	private class Dump {
		Stack<Object> stack;
		LinkedList<Object> control;
		Scope environment;

		public Dump(Stack<Object> s, LinkedList<Object> control, Scope env) {
			this.stack = s;
			this.control = control;
			this.environment = env;
		}
	}

	private class ApplyObj {
		@Override
	  	public String toString() {
	    	return "ap";
	    }
	}
	
	private Scope closureScope;
	private FL_FunctionCall functionCall;
	
	public SECD(Closure closure) throws Exception {
		if(closure.getExpression() instanceof FL_FunctionCall) {
			this.closureScope = closure.getScope();
			this.functionCall = (FL_FunctionCall) closure.getExpression();
		} else {
			throw new Exception("Tried to invoke SECD on something that's not a function call");
		}
	}
	
	public Object runSECD() throws Exception {
		System.out.println();
		Print.SECD("Starting SECD machine");
		
		//Initialize stack, environment, control & dump
	  	Stack<Object> stack        = new Stack<Object>();
	  	Scope environment          = closureScope;
	  	LinkedList<Object> control = new LinkedList<Object>();
	  	Stack<Dump> dump           = new Stack<Dump>();

	  	//Convert to reverse polish
		control.add(functionCall.getInitFunction());
		for(Object object : functionCall.getArguments()) {
		  	if(object instanceof FL_FunctionCall) {
		  		//TODO: Make sure that this preserves brackets!!!
		  		//return ((x -> x ++ x) [1]) ++ [123]
		  	  	Print.SECD("FLATTEN");
		  	  	control.add(((FL_FunctionCall) object).getInitFunction());
				for(Object o1 : ((FL_FunctionCall) object).getArguments()) {
					control.add(new ApplyObj());
				  
					control.add(o1);
				}
		  	} else { 
				control.add(object);
			}
			control.add(new ApplyObj());
		}
		Print.SECD("Initial control: ", control);

		Object controlItem = null;

		do {
			while(!control.isEmpty()) {
				controlItem = control.pop();
				Print.SECD("Popped: ", controlItem);
	
				if(controlItem instanceof ApplyObj) {
					//Begin application
					Print.SECD();
					Print.SECD("Applying... ");
	
					//Pop two items from the top of the stack
					Object value = stack.pop();

					Object potentialFunction = stack.pop();
					Print.SECD("PotFunc: " + potentialFunction + " (" + potentialFunction.getClass().getName() + ")");

					FL_Function lambda = null;
					Object builtinResult = null;
					if(potentialFunction instanceof FL_Function) {
						lambda = (FL_Function) potentialFunction;
					} else if(potentialFunction instanceof FL_FunctionCall) {
						FL_FunctionCall lambdaCall = (FL_FunctionCall) potentialFunction;
						lambda = (FL_Function) lambdaCall.getInitFunction();
					} else if(potentialFunction instanceof FL_Builtin) {
						FL_Builtin builtin = (FL_Builtin) potentialFunction;
						switch(builtin.getType()) {
							case HEAD:
								if(!(value instanceof LinkedList)) {
									throw new Exception("head function requires a list as a parameter");
								} else {
								  	LinkedList<?> list = ((LinkedList<?>) value);
								  	if(list.isEmpty()) {
										throw new Exception("List is empty, cannot retrieve the head of the list");
								  	}
								  	builtinResult = Evaluator.evaluate(new Closure(closureScope, list.getFirst()));
								} 
							case TAIL:
								if(!(value instanceof LinkedList)) {
									throw new Exception("tail function requires a list as a parameter, not a " + value.getClass().getName());
								} else {
								  	LinkedList list = ((LinkedList) value);
								  	if(list.isEmpty()) {
										throw new Exception("List is empty, cannot retrieve the tail of the list");
								  	}
								  	Evaluatable result = null;
								  	if(value instanceof FL_List) {
								  	  	result = new FL_List(list.subList(1, list.size()));
								  	} else if(value instanceof FL_String) {
										result = new FL_String(list.subList(1, list.size()));
								  	}
								  	builtinResult =  result;
								  	
								}
						}
					} else {
						Object a = Evaluator.evaluate(new Closure(closureScope, potentialFunction));
						Print.SECD("Evaluated invalid PotFunc to " + a);
					}

					Print.SECD("Value: ", value);
					Print.SECD("Lambda: ", lambda);
					Print.SECD("Current environment: ", environment);
					
					Object result = null;
					if(builtinResult == null) {
						//Bind it properly in the current environment
						//Type check
						Type type = lambda.getParameter().getType();
						if(!Type.isType(value, type)) {
							throw new Exception("Invalid type. Expected " + type + ", but got " + value.getClass().getSimpleName()); 
						}

						Print.SECD("Binding " + value + " to " + lambda.getParameter().getName());
						environment.put(lambda.getParameter().getName(), value);
						 result = lambda.getExpression();

//						Print.SECD("Added complete. Result: " + result.getClass().getName(), result);
					} else {
						result = builtinResult;
					}
					
	
					//If the result is an abstraction, dump it
					if(result instanceof FL_FunctionCall) {
					    //Dump
					  	Print.SECD("Beginning dump...");
					  	@SuppressWarnings("unchecked") 
						Dump newDump = new Dump(
						  (Stack<Object>) stack.clone(),
						  new LinkedList<Object>(control),
						  environment.copy()
						);
						dump.push(newDump);
			
						stack.clear();
						control.clear();
//						environment.clear();
			
						control.add(result);
					} else {
					  	//Push result on the stack
						stack.push(result);
					}
				} else {
				  	
					//If it's a FL_Var, evaluate it
					if(controlItem instanceof Evaluatable && !(controlItem instanceof FL_Function)) {
					  	Print.SECD("control item to evaluate: ", controlItem);

						Evaluatable e = (Evaluatable) controlItem;
						controlItem = e;
					  	
						//controlItem = evaluate(globalScope, controlItem);
						Scope evaluationScope = new Scope(environment);
						evaluationScope.putAll(closureScope);
						controlItem = Evaluator.evaluate(new Closure(evaluationScope, controlItem));
						Print.SECD("Evaluated control item as: ", controlItem);
					}
					//Otherwise, don't. Push the control item on the stack
					stack.push(controlItem);
					Print.SECD("Added control item to stack.");
				}
			}

			if(!dump.isEmpty()) {
			  	Print.SECD("Restoring from dump");
			  	Dump restoredDump = dump.pop();

			  	while(!stack.isEmpty()) {
					restoredDump.stack.push(stack.pop());
			  	}

			  	stack = restoredDump.stack;
			  	control = restoredDump.control;
			  	environment.putAll(restoredDump.environment);
			  	Print.SECD("Dump restored");
			}

		} while(!control.isEmpty() || !dump.isEmpty());

		Scope newEnv = new Scope(environment);
		Print.SECD("SECD ended with ", stack.peek().getClass().getSimpleName());
		Print.SECD("SECD scope was ", newEnv);
		Object result = stack.pop();
		return Evaluator.evaluate(new Closure(newEnv, result));
	}

}
