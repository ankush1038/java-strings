import java.util.Scanner;

public class StringSplitter {
    
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

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a text:");
        String inputString = sc.nextLine();
        
        sc.close();
        
        // Split text using custom method
        String[] customSplit = splitTextCustom(inputString);
        
        // Split text using built-in method
        String[] builtInSplit = inputString.split(" ");
        
        // Compare both results
        boolean areEqual = compareStringArrays(customSplit, builtInSplit);
        
        // Display results
        System.out.println("Custom Split Result: " + String.join(", ", customSplit));
        System.out.println("Built-in Split Result: " + String.join(", ", builtInSplit));
        System.out.println("Both methods give the same result: " + areEqual);
    }
}

/*
Input : Enter a text:
Ankush

Output : Custom Split Result: Ankush
Built-in Split Result: Ankush
Both methods give the same result: true

*/
