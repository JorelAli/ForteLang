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
}