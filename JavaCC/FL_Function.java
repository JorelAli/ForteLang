import java.util.Stack;

public class FL_Function implements Evaluatable {
	private final String parameter;
	private final Object expression;

	public FL_Function(String parameter, Object expression) {
		this.parameter = parameter;
		this.expression = expression;
	}

	public String getParameter() {
		return this.parameter;
	}

	public Object getExpression() {
		return this.expression;
	}

	@Override 
	public String toString() { 
		return "FL_Function(" + parameter + ") -> (" + expression + ")"; 
	}
}