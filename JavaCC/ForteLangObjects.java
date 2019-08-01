public class ForteLangObjects {
	
	static interface FL_Object {}
	
	static interface SetObject extends FL_Object {}
	
	static interface Expression extends FL_Object {}

	/** Primitives */
	
	static class FL_Number implements Expression {}

	static class FL_FloatingNumber implements Expression  {}

	static class FL_Boolean implements Expression  {}
	
	static class FL_String implements Expression {}
	
	static class FL_Set implements Expression {}
	
	static class FL_List implements Expression {}
	
	static class FL_Enum implements SetObject {}
	
	static class FL_Function implements Expression {}
	
	static class FL_Lambda implements Expression {}
	
}
