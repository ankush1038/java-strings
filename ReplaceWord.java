import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();
        
        System.out.print("Enter the new word: ");
        String newWord = sc.next();
        
        // Replace word and display the result
        System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord));
        
        sc.close();
    }

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        
        String result = "";
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                words[i] = newWord;
            }
            result += words[i] + " ";
        }
        
        return result.trim();
    }
}

/*
Input :
Enter a sentence: Ankush is hired of capgemini
Enter the word to replace: hired
Enter the new word: owner

Output :
Modified Sentence: Ankush is owner of capgemini
 */
