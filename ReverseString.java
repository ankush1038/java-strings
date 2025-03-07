import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Call method to reverse the string and display the result
        System.out.println("Reversed String: " + reverseString(input));
        
        sc.close();
    }

    // Method to reverse a given string without built-in functions
    public static String reverseString(String input) {
        
        // Create a new string to store the reversed version
        String reversed = "";
        
        // Iterate through the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        return reversed;
    }
}
