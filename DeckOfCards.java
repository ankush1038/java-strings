import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of players and cards
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        sc.close();

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Distribute and print cards
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
        printPlayersCards(distributedCards);
    }

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        int totalCardsNeeded = players * cardsPerPlayer;

        if (totalCardsNeeded > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }

    public static void printPlayersCards(String[][] playerCards) {
        if (playerCards == null) {
            return;
        }

        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playerCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }
}

/*

Input :
Enter number of players: 2
Enter number of cards per player: 16

Output :
Player 1's cards:
  10 of Spades
  4 of Diamonds
  Ace of Spades
  Queen of Spades
  King of Diamonds
  6 of Hearts
  7 of Diamonds
  Queen of Hearts
  2 of Diamonds
  7 of Spades
  9 of Clubs
  8 of Spades
  King of Clubs
  2 of Hearts
  8 of Clubs
  9 of Diamonds

Player 2's cards:
  4 of Spades
  5 of Diamonds
  3 of Diamonds
  Jack of Clubs
  King of Hearts
  5 of Spades
  8 of Hearts
  7 of Hearts
  4 of Hearts
  5 of Hearts
  6 of Clubs
  Jack of Hearts
  6 of Diamonds
  10 of Hearts
  3 of Hearts
  2 of Clubs

*/