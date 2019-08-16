import java.util.LinkedHashMap;
import java.util.Map;

public class FL_Set extends LinkedHashMap<String, Object> implements Evaluatable {
	private boolean impure;

	public FL_Set(boolean impure) {
		super();
		this.impure = impure;
	}

	public FL_Set(Map<String, Object> m, boolean impure) {
		super(m);
		this.impure = impure;
	}

	public void setImpure(boolean b) {
		this.impure = b;
	}

	public boolean isImpure() {
		//TODO:
		return impure;
	}

	public FL_Set copy() {
		return new FL_Set(this, impure);
	}

	@Override
	public String toString() {
		return (impure ? "impure " : "") + super.toString();
	}

	@Override
	public boolean equalsWithScope(Object o, FL_Set scope) throws Exception {
		if(o instanceof FL_Set) {
			FL_Set set = (FL_Set) o;
			if(this.keySet().equals(set.keySet())) {
				for(String key : this.keySet()) {
					Object o1 = ForteLang.evaluate(scope, this.get(key));
					Object o2 = ForteLang.evaluate(scope, set.get(key));
					if(!o1.equals(o2)) {
						return false;
					}
				}
				return true;
			} else {
				System.out.println("Different keysets");
				return false;
			}
		} else {
			System.out.println("Not FL_Set");
			return false;
		}
	}
}