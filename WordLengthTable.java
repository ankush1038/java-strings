import java.util.Scanner;

public class WordLengthTable {
    
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

    // Method to split text into words without using split()
    public static String[] splitTextCustom(String text) {
        int length = findLengthCustom(text);
        int wordCount = 1;
        
        // Count spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start);
        
        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findLengthCustom(words[i]));
        }
        
        return wordsWithLengths;
    }

    // Method to display words with their lengths in a tabular format
    public static void displayWordsWithLengths(String[][] wordsWithLengths) {
        System.out.println("Word\tLength");
        System.out.println("----------------");
        
        for (String[] wordData : wordsWithLengths) {
            System.out.println(wordData[0] + "\t" + Integer.parseInt(wordData[1]));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a text:");
        String inputString = sc.nextLine();
        
        sc.close();
        
        // Split text using custom method
        String[] customSplit = splitTextCustom(inputString);
        
        // Get words with their lengths
        String[][] wordsWithLengths = getWordsWithLengths(customSplit);
        
        // Display results in tabular format
        displayWordsWithLengths(wordsWithLengths);
    }
}

/*
Input : Enter a text:
Ankush

Output :
Word    Length
----------------
Ankush  6


*/
