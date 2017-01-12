
// Import library to use Scanner object
import java.util.*;

// Class to get to know the user
public class HelloYou {

	// Create a class variable of a scanner object to allow user input to
	// console
	static Scanner scanner = new Scanner(System.in);

	// Statis class variable to hold string array for user info
	static String[] userVars;

	static String[] details;

	// ADDD birthday
	// method to say farewell to user
	public static void exitApplication() {
		// mesaage to say farewell to user
		System.out.println("\nThank you for using the SQA Greeting Application!");
		// Exit the system
		System.exit(0);
	}

	public static void main(String[] args) {
		// Declare local variables
		String name;
		// output a welcome message to user
		System.out.println("Hello, and welcome to SQA Selenium Boot Camp");
		// Request the user's name
		System.out.print("Could I please get your name? ");
		// set the captured name to a local string variable, name
		name = scanner.nextLine();
		// call method to get user input and set it to a variable which holds an
		// array of Strings
		details = requestUserInfo(name, "age", "city of residence", "favorite color", "current mood");
		// Output the information to the user
		outputUserDetails(name);
		// Call method which gives a farewell to user and exits the system.
		exitApplication();
	}

	public static void outputUserDetails(String name) {
		// Begin outputing user gathered details sch as their name
		System.out.println("\nwell " + name + ", it seems I have learned enough about you.");
		// Iterate through user details backwards, each iteration echos a
		// details
		for (int i = userVars.length - 1; i > 0; i--) {
			// Echo detail gathered of user info and requested details console
			System.out.println(" your " + details[i] + " is " + userVars[i] + " . ");
		}
	}

	// This is a method or function (components that make up the method form a
	// method signature)
	public static String[] requestUserInfo(String name, String... details) {
		// Create an array of strings type objects to hold values for user, size
		// is based on supplied arguments
		userVars = new String[details.length];
		// Greet the user
		System.out.println("I am excited to learn more about you " + name + "!");
		// Perform a loop for the amount of iterations equal to the length of
		// supplied items
		for (int i = 0; i < details.length; i++) {
			// For each iteration ask the user for details
			System.out.print("Can I get your " + details[i] + ", Please? ");
			// Capture user input in relative variable withing array
			userVars[i] = scanner.nextLine();
		}
		// return the string array of supplied details
		return details;
	}
}