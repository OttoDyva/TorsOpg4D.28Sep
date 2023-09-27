import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    /*private static void makeAGuess(){
		// Create a Scanner object   
        Scanner scanner = new Scanner(System.in);
    	// Read user input
        String input = scanner.nextLine();
        //use hasNextDouble to check if input is numeric, 
        if(input.hasNextDouble())
        {
            double guess = Double.parseDouble(input);
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid number");
        }
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   */
    private static void makeAGuess() {
    // Create a Scanner object   
    Scanner scanner = new Scanner(System.in);
    // Read user input
    String input = scanner.nextLine();
    
    // Check if input is numeric
    if (input.matches() {
        double guess = Double.parseDouble(input);
        // Compare it with the random number (not shown in this code)
        // Let the user know the result of the comparison (not shown in this code)
        // Handle the game logic here

    } else {
        System.out.println("Invalid number. Please enter a numeric value.");
        // Call this method recursively to allow the user to try again
        makeAGuess();
    }
}

}