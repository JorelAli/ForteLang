import java.util.HashMap;
import java.util.Map;

public class Scope extends HashMap<String, Object> { 

    public Scope() {
        super();
    }

    public Scope(Map<String, Object> map) {
		super(map);
	}

    public Scope copy() {
		return new Scope(this);
	}

}  