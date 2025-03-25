import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        
        sc.close();
    }

    public static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}