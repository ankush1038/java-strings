import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        System.out.print("Enter character to remove: ");
        char charToRemove = sc.next().charAt(0);
        
        // Remove occurrences and display the result
        System.out.println("Modified String: " + removeCharacter(input, charToRemove));
        
        sc.close();
    }

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String input, char charToRemove) {
        
        String result = "";
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != charToRemove) {
                result += input.charAt(i);
            }
        }
        
        return result;
    }
}

/*
Input : 
String: "Hello World"
Character to Remove: 'l'

Output :
Modified String: "Heo Word"

*/
