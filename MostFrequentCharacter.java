import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Find and display the most frequent character
        System.out.println("Most Frequent Character: '" + findMostFrequentChar(input) + "'");
        
        sc.close();
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentChar(String input) {
        
        int[] freq = new int[256]; // ASCII character frequency array
        
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }
        
        char mostFrequent = input.charAt(0);
        int maxCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (freq[input.charAt(i)] > maxCount) {
                maxCount = freq[input.charAt(i)];
                mostFrequent = input.charAt(i);
            }
        }
        
        return mostFrequent;
    }
}

/*
Input :
Enter a string: success

Output :
Most Frequent Character : 's'
*/