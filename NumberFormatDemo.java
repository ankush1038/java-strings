import java.util.Scanner;

public class NumberFormatDemo {
    
    // Method to generate NumberFormatException
    public static void generateException(String text) {
	
        // Attempting to parse a non-numeric string to an integer
        int number = Integer.parseInt(text); // This will throw an exception
        System.out.println("Converted number: " + number);
    }
    
    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a number as a string:");
        String inputString = sc.next();
        
        sc.close();
        
        // Calling method that generates exception
        // generateException(inputString); // Uncomment to see the exception
        
        // Calling method that handles exception
        handleException(inputString);
    }
}

/* Input : Enter a number as a string:
ankush

Output :NumberFormatException caught: For input string: "ankush"
Enter a number as a string:
1

Output : Converted number: 1
*/