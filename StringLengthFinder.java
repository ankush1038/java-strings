import java.util.Scanner;

public class StringLengthFinder {
    
    // Method to find the length of a string without using length()
    public static int findLengthCustom(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a text:");
        String inputString = sc.next();
        
        sc.close();
        
        // Find length using custom method
        int customLength = findLengthCustom(inputString);
        
        // Find length using built-in method
        int builtInLength = inputString.length();
        
        // Display results
        System.out.println("Custom Length Calculation: " + customLength);
        System.out.println("Built-in Length Calculation: " + builtInLength);
        System.out.println("Both methods give the same result: " + (customLength == builtInLength));
    }
}

/*
Input : Enter a text:
ankush

Output : Custom Length Calculation: 6
Built-in Length Calculation: 6
Both methods give the same result: true

*/