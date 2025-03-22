import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4]; // Array size should match stored values

        // Storing multiplication results for 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6); // i+6 gives 6,7,8,9
        }

        // Printing the multiplication table
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}