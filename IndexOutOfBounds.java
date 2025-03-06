import java.util.Scanner;

public class IndexOutOfBounds {
    
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing an index beyond the string length
        System.out.println(text.charAt(text.length())); // This will throw an exception
    }
    
    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a string:");
        String inputString = sc.next();
        
        sc.close();
        
        // Calling method that generates exception
        // generateException(inputString); // Uncomment to see the exception
        
        // Calling method that handles exception
        handleException(inputString);
    }
}

/* Input  : Enter a string:
Ankush

Output : StringIndexOutOfBoundsException caught: String index out of range: 18
*/
