import java.util.Scanner;

public class NaturalNumberSumRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (greater than 0).");
            return;
        }
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula (n*(n+1)/2): " + sumFormula);
        if (sumRecursion == sumFormula) {
            System.out.println("Both results match!");
        } else {
            System.out.println("There is a mismatch!");
        }

        sc.close();
    }
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
