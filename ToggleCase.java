import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Toggle case and display the result
        System.out.println("Toggled case string: " + toggleCase(input));
        
        sc.close();
    }

    // Method to toggle case of each character in a string
    public static String toggleCase(String input) {
        
        String result = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        
        return result;
    }
}

/* 
Input :
Enter a string: ankUsh

Output :
Toggled case string: ANKuSH
*/
