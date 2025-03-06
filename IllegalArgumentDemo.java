import java.util.Scanner;

public class IllegalArgumentDemo {
    
    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Setting start index greater than end index
        System.out.println(text.substring(5, 2)); // This will throw an exception
    }
    
    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
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

/*
Input : Enter a string:
Ankush

Output : RuntimeException caught: begin 5, end 2, length 6
*/
