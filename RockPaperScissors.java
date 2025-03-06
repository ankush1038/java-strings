import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    // Method to generate computer's choice
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        return choices[random.nextInt(3)];
    }
    
    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    
    // Method to calculate win percentage
    public static String[][] calculateWinStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];
        stats[0][0] = "User";
        stats[0][1] = String.format("%.2f%%", (userWins * 100.0) / totalGames);
        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f%%", (computerWins * 100.0) / totalGames);
        return stats;
    }
    
    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] winStats) {
        System.out.println("Game Results:");
        System.out.println("Game	User Choice	Computer Choice	Winner");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t" + gameResults[i][2]);
        }
        
        System.out.println("\nWin Statistics:");
        System.out.println("Player	Win Percentage");
        System.out.println("------------------------");
        for (String[] stat : winStats) {
            System.out.println(stat[0] + "\t" + stat[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of games:");
        int numGames = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        String[][] gameResults = new String[numGames][3];
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < numGames; i++) {
            System.out.println("Enter Rock, Paper, or Scissors:");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }
        
        sc.close();
        
        // Calculate win statistics
        String[][] winStats = calculateWinStats(userWins, computerWins, numGames);
        
        // Display results
        displayResults(gameResults, winStats);
    }
}

/*
Input : 
Enter the number of games:
3
Enter Rock, Paper, or Scissors:
Paper
Enter Rock, Paper, or Scissors:
Rock
Enter Rock, Paper, or Scissors:
Scissors

Output : 
Game Results:
Game    User Choice     Computer Choice Winner
------------------------------------------------
1       Paper   Scissors        Computer
2       Rock    Paper   Computer
3       Scissors        Rock    Computer

Win Statistics:
Player  Win Percentage
------------------------
User    0.00%
Computer        100.00%
