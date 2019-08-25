public class FL_Builtin implements Evaluatable {

	enum Builtin { 
		IMPORT, 
		PRINT, 
		EXEC, 
		HEAD, 
		TAIL, 
		INPUT, 
		INPUTBOX,
		ABORT, 
		LENGTH
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
    public boolean equalsWithScope(Object o, Scope scope) { 
		return false;
	}
	
	public static FL_Builtin fromString(String str) {
		switch(str) {
			case "head": return new FL_Builtin(FL_Builtin.Builtin.HEAD, null);
			case "tail": return new FL_Builtin(FL_Builtin.Builtin.TAIL, null);
//			case "length": return new FL_Builtin(FL_Builtin.Builtin.LENGTH, null);
			case "@import": return new FL_Builtin(FL_Builtin.Builtin.IMPORT, null);
			case "@abort": return new FL_Builtin(FL_Builtin.Builtin.ABORT, null);
			
		}
		Print.EVAL("Failed to parse Builtin from \"" + str + "\"");
		return null;
	}
}