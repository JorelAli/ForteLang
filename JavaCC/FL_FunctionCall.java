import java.util.LinkedList;

public class FL_FunctionCall implements Evaluatable {
	private Object initFunction;
	private final LinkedList<Object> arguments;

	public FL_FunctionCall() {
		arguments = new LinkedList<Object>();
	}

	public LinkedList<Object> getArguments() {
		return this.arguments;
	}

	public void setInitFunction(Object initFunction) {
		this.initFunction = initFunction;
	}

	public Object getInitFunction() {
		return this.initFunction;
	}

	@Override
	public String toString() {
		if(initFunction instanceof FL_Var) {
			return ((FL_Var) initFunction).getName();
		} else if(initFunction instanceof FL_Function) {
			FL_Function func = (FL_Function) initFunction;
			if(arguments.size() == 0) {
				return "(" + func.toString() + ")";
			} else {
				return "(" + func.toString() + " and " + arguments.size() + " argument" + (arguments.size() == 1 ? "" : "s") + ")";
			}
		}
		return super.toString();
	}

	@Override
    public boolean equalsWithScope(Object o, Scope scope) { 
		return false;
	}
}