import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;

public class OperatorParser {

	enum Operator {
		BOOLEAN, NUMERICAL, SET, COMPARATOR, CONCAT, CONTAINS, SELECT
	};

	Operator operatorKind;
	String op;

	public OperatorParser(Token operator) throws Exception {

		switch (operator.kind) {
			case ForteLangConstants.BOOLEAN_OP:
				operatorKind = Operator.BOOLEAN;
				break;
			case ForteLangConstants.OP:
				operatorKind = Operator.NUMERICAL;
				break;
			case ForteLangConstants.SET_OP:
				operatorKind = Operator.SET;
				break;
			case ForteLangConstants.COMPARATOR_OP:
				operatorKind = Operator.COMPARATOR;
				break;
			case ForteLangConstants.CONCAT:
				operatorKind = Operator.CONCAT;
				break;
			case ForteLangConstants.CONTAINS:
				operatorKind = Operator.CONTAINS;
				break;
			case ForteLangConstants.SELECT:
				operatorKind = Operator.SELECT;
				break;
			default:
				throw new Exception("Invalid operator for OperatorParser: " + operator.image);
		}
		op = operator.image;
	}

	public Object apply(Closure expr1, Closure expr2) throws Exception {

		Object o1 = Evaluator.evaluate(expr1);
		Object o2 = Evaluator.evaluate(expr2);

		if (operatorKind != Operator.SELECT) {
			// Print.EVAL("Current scope in OpExpr: ", scope);
			// if (o1 instanceof Evaluatable) {
			// Evaluatable e = (Evaluatable) o1;
			// Print.EVAL("EvalOpExpr left part", o1);
			// o1 = Evaluator.evaluate(scope, e);
			//
			//// o1 = evaluate(scope, o1);
			// }
			//
			// if (o2 instanceof Evaluatable) {
			//// Print.EVAL("EvalOpExpr right part", o2);
			//// o2 = evaluate(scope, o2);
			//
			// Evaluatable e = (Evaluatable) o2;
			// Print.EVAL("EvalOpExpr right part", o2);
			// o2 = Evaluator.evaluate(scope, e);
			// }

		}

		switch (operatorKind) {
			case BOOLEAN:
				return applyBoolean((boolean) o1, (boolean) o2);
			case NUMERICAL:
				return applyNumber((BigDecimal) o1, (BigDecimal) o2);
			case SET:
				return applySetObjects((FL_Set) o1, (FL_Set) o2);
			case COMPARATOR:
				return applyComparator(o1, o2);
			case CONCAT:
				return applyConcat(o1, o2);
			case CONTAINS:
				return applyContains(o1, o2);
			case SELECT:
				return applySelect(o1, o2);
		}
		throw new Exception("Failed to apply any operators");
	}

	public Object applySelect(Object o1, Object o2) throws Exception {
		return null;
//		Print.EVAL("EvalOpExpr left part", o1);
//		o1 = evaluate(scope, o1);
//
//		if (o1 instanceof FL_Set) {
//			FL_Set set = (FL_Set) o1;
//			if (o2 instanceof FL_String) {
//				Object result = set.get(((FL_String) o2).stringValue());
//				if (result == null) {
//					throw new Exception("Cannot find element \"" + o2 + "\" in set containing " + set.keySet());
//				} else {
//					return result;
//				}
//			} else if (o2 instanceof FL_FunctionCall) {
//				FL_FunctionCall func = (FL_FunctionCall) o2;
//				if (func.getInitFunction() instanceof FL_Var) {
//					FL_Var var = (FL_Var) func.getInitFunction();
//					Object result = set.get(var.getName());
//					if (result == null) {
//						throw new Exception(
//								"Cannot find element \"" + var.getName() + "\" in set containing " + set.keySet());
//					} else {
//						return result;
//					}
//				} else {
//					if (func.getInitFunction() instanceof Evaluatable) {
//						return applySelect(o1, Evaluator.evaluate(new Closure(scope, func)));
//					} else {
//						throw new Exception(
//								"Cannot select from a set using a " + func.getInitFunction().getClass().getName());
//					}
//				}
//			} else if (o2 instanceof Evaluatable) {
//				return applySelect(o1, Evaluator.evaluate(new Closure(scope, o2)));
//			} else {
//				throw new Exception("Cannot select from a set using a " + o2.getClass().getName());
//			}
//		} else {
//			throw new Exception("Cannot select from an object that's not a set");
//		}
	}

	public Object applyContains(Object o1, Object o2) throws Exception {
		if (o1 instanceof FL_List) {
			FL_List l1 = (FL_List) o1;
			return l1.contains(o2); // TODO: Fix this
		} else if (o1 instanceof FL_String) {
			FL_String s1 = (FL_String) o1;
			if (o2 instanceof FL_String) {
				FL_String s2 = (FL_String) o2;
				return s1.stringValue().contains(s2.stringValue());
			}
		} else if (o1 instanceof FL_Set) {
			FL_Set s1 = (FL_Set) o1;
			if (o2 instanceof FL_String) {
				FL_String s2 = (FL_String) o2;
				return s1.containsKey(s2.stringValue());
			}
		}
		throw new Exception("Cannot check for existance within a " + o1.getClass().getName());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object applyConcat(Object o1, Object o2) throws Exception {
		if (o1 instanceof LinkedList && o2 instanceof LinkedList) {
			LinkedList l1 = (LinkedList) o1;
			LinkedList l2 = (LinkedList) o2;
			l1.addAll(l2);
			return l1;
		} else {
			throw new Exception("Cannot concatenate " + o1.getClass().getName() + " with " + o2.getClass().getName());
		}
	}

	public boolean applyComparator(Object o1, Object o2) throws Exception {
//		switch (op) {
//		case ">":
//			return ((BigDecimal) o1).compareTo((BigDecimal) o2) > 0;
//		case "<":
//			return ((BigDecimal) o1).compareTo((BigDecimal) o2) < 0;
//		case "<=":
//			return ((BigDecimal) o1).compareTo((BigDecimal) o2) <= 0;
//		case ">=":
//			return ((BigDecimal) o1).compareTo((BigDecimal) o2) >= 0;
//		case "==":
//			System.out.println("Comparing " + o1 + " to " + o2);
//			if (o1 instanceof Evaluatable || o2 instanceof Evaluatable) {
//				Evaluatable e1 = (Evaluatable) o1;
//				return e1.equalsWithScope(o2, scope);
//			}
//			return o1.equals(o2);
//		case "!=":
//			if (o1 instanceof Evaluatable || o2 instanceof Evaluatable) {
//				Evaluatable e1 = (Evaluatable) o1;
//				return !e1.equalsWithScope(o2, scope);
//			}
//			return !o1.equals(o2);
//		}
		throw new Exception("Invalid operator (expected comparator operator");
	}

	public BigDecimal applyNumber(BigDecimal f1, BigDecimal f2) throws Exception {
		if (operatorKind != Operator.NUMERICAL) {
			throw new Exception("Invalid operator (expected numerical operator)");
		}

		switch (op) {
		case "+":
			return f1.add(f2);
		case "*":
			return f1.multiply(f2);
		case "-":
			return f1.subtract(f2);
		case "/":
			return f1.divide(f2, 128, RoundingMode.HALF_DOWN);
		case "%":
			return f1.remainder(f2);
		}
		throw new Exception("Invalid operator " + op);
	}

	public boolean applyBoolean(boolean b1, boolean b2) throws Exception {
		if (operatorKind != Operator.BOOLEAN) {
			throw new Exception("Invalid operator (expected boolean operator)");
		}
		switch (op) {
		case "||":
			return b1 || b2;
		case "&&":
			return b1 && b2;
		}
		throw new Exception("Invalid operator " + op);
	}

	public FL_Set applySetObjects(FL_Set s1, FL_Set s2) throws Exception {
		if (operatorKind != Operator.SET) {
			throw new Exception("Invalid operator (expected set operator)");
		}

		FL_Set newSet = s1.copy();

		switch (op) {
		// union
		case "/+": {
			newSet.putAll(s2);
			break;
		}
		// intersect
		case "/-": {
			newSet.putAll(s1);
			newSet.keySet().retainAll(s2.keySet());
			for (String key : newSet.keySet()) {
				newSet.put(key, s1.get(key));
			}
			break;
		}
		// difference
		case "//": {
			for (String key : s2.keySet()) {
				newSet.remove(key);
			}
			break;
		}
		}
		return newSet;
	}
}