import java.util.Scanner;

public class NullPointerDemo {
    
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }
    
    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Calling method that generates exception
        // generateException(); // Uncomment to see the exception
        
        // Calling method that handles exception
        handleException();
    }
}
