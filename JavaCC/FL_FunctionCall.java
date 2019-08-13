import java.util.LinkedList;

public class FL_FunctionCall implements Evaluatable {
	Object initFunction;
	LinkedList<Object> arguments;

	public FL_FunctionCall() {
		arguments = new LinkedList<Object>();
	}
}