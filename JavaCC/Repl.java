import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Repl {

	public static void init() {
		System.out.println("Welcome to the ForteLang repl (v0.0.1). Type :help for help.");
		System.out.println();
		Scanner scanner = ForteLang.getGlobalScanner();
		repl: while(true) {
		  	System.out.print("fl-repl> ");
			String input = null;
			try { 
				input = scanner.nextLine();
			} catch(Exception e) { scanner.close(); }
			switch(input) {
				case ":help":
					System.out.println("The following commands are available:");
					System.out.println();
					System.out.println("  :q\tExit ForteLang repl");
					System.out.println();
					continue repl;
				case ":q":
					break repl;
			}
			
			try { 
				Object result = new ForteLang(new ByteArrayInputStream(input.getBytes())).input();
				System.out.println("=> " + ForteLang.prettifyOutput(result) + "\n");
			} catch(Error e) {
				System.out.println("=>> Error, invalid input \"" + input + "\"");
				System.out.println(e.getMessage() + "\n");
			} catch(Exception e) {
				System.out.println("=>> Error, invalid input \"" + input + "\"");
				System.out.println(e.getMessage() + "\n");
			}
		}
	}
	
}
