import java.util.LinkedHashMap;
import java.util.Map;

public class FL_Set extends LinkedHashMap<String, Object> implements Evaluatable {

	public FL_Set() {
		super();
	}

	public FL_Set(Map<String, Object> map) {
		super(map);
	}

	public FL_Set copy() {
		return new FL_Set(this);
	}

	@Override
	public boolean equalsWithScope(Object o, Scope scope) throws Exception {
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