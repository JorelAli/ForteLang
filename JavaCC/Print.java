
public class Print {

	public static void SECD()                   { print("SECD"); }
	public static void SECD(Object o)           { print("SECD", o); }
	public static void SECD(String s, Object o) { print("SECD", s, o); }

	public static void EVAL()                   { print("EVAL"); }
	public static void EVAL(Object o)           { print("EVAL", o); }
	public static void EVAL(String s, Object o) { print("EVAL", s, o); }

	public static void OPEX()                   { print("OPEX"); }
	public static void OPEX(Object o)           { print("OPEX", o); }
	public static void OPEX(String s, Object o) { print("OPEX", s, o); }
	
	private static void print(String title)           { print(title, "", ""); }
	private static void print(String title, Object o) { print(title, "", o); }
	private static void print(String title, String init, Object o) {
	  	if(ForteLang.LOGGING_ENABLE) {
		  	System.out.println("[" + title + "] " + init + (init.isEmpty() ? "" : " ") + o);
	  	}
	}

	
}
