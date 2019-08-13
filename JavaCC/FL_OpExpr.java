public class FL_OpExpr implements Evaluatable {
	private final Object leftExpr;
	private final Object rightExpr;
	private final Token operator;
	
	public FL_OpExpr(Object left, Object right, Token operator) {
		this.leftExpr = left;
		this.rightExpr = right;
		this.operator = operator;
	}

	public Object getLeftExpr() {
		return this.leftExpr;
	}

	public Object getRightExpr() {
		return this.rightExpr;
	}

	public Token getOperator() {
		return this.operator;
	}

	@Override public String toString() {
		StringBuilder builder = new StringBuilder("FL_OpExpr[");
		builder.append(leftExpr);
		builder.append(" ");
		builder.append(operator.image);
		builder.append(" ");
		builder.append(rightExpr);
		return builder.append("]").toString();
	}
}