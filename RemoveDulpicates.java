import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Remove duplicates and display the modified string
        System.out.println("String after removing duplicates: " + removeDuplicates(input));
        
        sc.close();
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String input) {
        
        String result = "";
        boolean[] seen = new boolean[256]; // ASCII character set size
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!seen[currentChar]) {
                result += currentChar;
                seen[currentChar] = true;
            }
        }
        
        return result;
    }
}

/*
Input : 
Enter a string: sssaaarrrt

Output:
String after removing duplicates: sart

*/
