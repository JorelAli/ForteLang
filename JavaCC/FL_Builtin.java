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
}