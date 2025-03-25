import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100. The computer will guess it.");
        
        do {
            guess = generateGuess(low, high, random);
            System.out.println("Is the number " + guess + "? (higher/lower/correct)");
            feedback = sc.nextLine().toLowerCase();
            
            if (feedback.equals("higher")) {
                low = guess + 1;
            } else if (feedback.equals("lower")) {
                high = guess - 1;
            }
        } while (!feedback.equals("correct"));

        System.out.println("The computer guessed your number!");
        sc.close();
    }

    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}