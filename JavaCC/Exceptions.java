
public class Exceptions {
	
	//Parsing errors
	///////////////////////////////////////////////////////////////////////
	
	private static void parsingError(String str) {
		System.out.println("Parsing failure: " + str);
	}
	
	//When a program is empty
	public static void EMPTY_PROGRAM(String location) {
		parsingError("Program is empty, cannot evaluate anything" + location);
		System.exit(0);
	}
	
	//When a program is empty
	public static void ITEM_IN_SET(String attrName, String location) {
		parsingError("Attribute \"" + attrName + "\" already exists in set" + location);
		System.exit(0);
	}
	
	//Evaluation errors
	///////////////////////////////////////////////////////////////////////
	
	private static void evalError(String str) {
		System.out.println("Evaluation failure: " + str);
	}
	
	//When a program is empty
	public static void FUNCTION_NOT_DEFINED(String functionName) {
		evalError("Function " + functionName + " was called, but has not been defined");
		System.exit(0);
	}
}
