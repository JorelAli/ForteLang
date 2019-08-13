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

	public FL_Set copy() {
		return new FL_Set(this, impure);
	}
}