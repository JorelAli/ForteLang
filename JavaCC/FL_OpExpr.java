import java.util.LinkedList;

public class FL_OpExpr implements Evaluatable {
	private Object leftExpr;
	private Object rightExpr;
	private Token operator;

	//Indicates whether this OpExpr is surrounded by brackets
	private final boolean bracketed;
	
	public FL_OpExpr(Object left, Object right, Token operator, boolean bracketed) {
		this.leftExpr = left;
		this.rightExpr = right;
		this.operator = operator;
		this.bracketed = bracketed;
		// restructureOpExpr();
	}

	// private void restructureOpExpr() {
	// 	if(operator.image.equals(".")) {
	// 		if(rightExpr instanceof FL_OpExpr) {
	// 			FL_OpExpr right = (FL_OpExpr) rightExpr;

	// 			// if(right.operator.image.equals(".")) {

	// 				this.rightExpr = right.getLeftExpr();

	// 				FL_OpExpr inner = new FL_OpExpr(leftExpr, rightExpr, operator);

	// 				this.leftExpr = inner;
	// 				this.rightExpr = right.getRightExpr();
	// 				this.operator = right.getOperator();
	// 			// }
	// 		}
	// 	}
	// }

	public Object getLeftExpr() {
		return this.leftExpr;
	}

	public Object getRightExpr() {
		return this.rightExpr;
	}

	public Token getOperator() {
		return this.operator;
	}

	public boolean hasBrackets() {
		return this.bracketed;
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