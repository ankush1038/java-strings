import java.util.Scanner;

public class SubstringOccurrences {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        
        System.out.print("Enter the substring to find: ");
        String subString = sc.nextLine();
        
        // Count occurrences and display result
        System.out.println("Occurrences of substring: " + countSubstringOccurrences(mainString, subString));
        
        sc.close();
    }

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String mainString, String subString) {
        
        int count = 0;
        int subLength = subString.length();
        
        for (int i = 0; i <= mainString.length() - subLength; i++) {
            if (mainString.substring(i, i + subLength).equals(subString)) {
                count++;
            }
        }
        
        return count;
    }
}

/*
Input :
Enter the main string: banana
Enter the substring to find: na

Output : 
Occurrences of substring: 2

*/
