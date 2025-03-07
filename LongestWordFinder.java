import java.util.Scanner;

public class LongestWordFinder {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        // Find and display the longest word
        System.out.println("Longest word: " + findLongestWord(sentence));
        
        sc.close();
    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        
        String longestWord = "";
        String word = "";
        
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            if (Character.isLetter(currentChar)) {
                word += currentChar;
            } else {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
                word = "";
            }
        }
        
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
        
        return longestWord;
    }
}

/*
Input : 
Enter a sentence: Ankush is hired by capgemini

Output :
Longest word: capgemini
*/
