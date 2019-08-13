import java.util.LinkedList;

public class FL_OpExpr implements Evaluatable {
	private Object leftExpr;
	private Object rightExpr;
	private Token operator;
	
	public FL_OpExpr(Object left, Object right, Token operator) {
		this.leftExpr = left;
		this.rightExpr = right;
		this.operator = operator;
		restructureOpExpr();
	}

	private void restructureOpExpr() {
		if(operator.image.equals(".")) {
			if(rightExpr instanceof FL_OpExpr) {
				FL_OpExpr right = (FL_OpExpr) rightExpr;
				this.rightExpr = right.getLeftExpr();

				FL_OpExpr inner = new FL_OpExpr(leftExpr, rightExpr, operator);

				this.leftExpr = inner;
				this.rightExpr = right.getRightExpr();
				this.operator = right.getOperator();
			}
		}
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