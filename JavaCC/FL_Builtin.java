public class FL_Builtin implements Evaluatable {

	enum Builtin { 
		IMPORT, 
		PRINT, 
		EXEC, 
		HEAD, 
		TAIL, 
		INPUT, 
		INPUTBOX 
	}

	private final Object param;
	private final Builtin type;

	public FL_Builtin(Builtin type, Object param) {
		this.type = type;
		this.param = param;
	}

	public Object getParameter() {
		return this.param;
	}

	public Builtin getType() {
		return this.type;
	}

	@Override
	public String toString() {
		return "builtin:" + type.name().toLowerCase();
	}

	@Override
    public boolean equalsWithScope(Object o, FL_Set scope) { 
		return false;
	}
}