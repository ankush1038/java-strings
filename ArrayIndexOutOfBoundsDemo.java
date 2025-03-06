import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        // Accessing an index beyond the array length
        System.out.println("Accessing element: " + names[index]); // This will throw an exception
    }
    
    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing element: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};
        
        // Prompt user for index input
        System.out.println("Enter an index to access (0 to " + (names.length - 1) + "):");
        int index = sc.nextInt();
        
        sc.close();
        
        // Calling method that generates exception
        // generateException(names, index); // Uncomment to see the exception
        
        // Calling method that handles exception
        handleException(names, index);
    }
}

/* Input : Enter an index to access (0 to 4):
6

Output : ArrayIndexOutOfBoundsException caught: Index 6 out of bounds for length 5
*/
