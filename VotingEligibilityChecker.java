import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityChecker {
    
    // Method to generate random ages for students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(82) + 10; // Generate ages between 10 and 91
        }
        return ages;
    }
    
    // Method to determine voting eligibility
    public static String[][] determineVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }
    
    // Method to display results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tEligibility");
        System.out.println("----------------");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input for number of students (default to 10)
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();
        
        sc.close();
        
        // Generate random ages
        int[] ages = generateAges(numStudents);
        
        // Determine voting eligibility
        String[][] results = determineVotingEligibility(ages);
        
        // Display results
        displayResults(results);
    }
}

/*
Input :
Enter the number of students:
3

Output :
Age     Eligibility
----------------
77      Can Vote
56      Can Vote
60      Can Vote
*/

