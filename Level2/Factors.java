import java.util.Scanner;

public class Factors {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.print("Enter a number: ");
           int number = sc.nextInt();
          
           int[] list = factorize(number);
          
           System.out.print("Factors are: ");
           for (int i : list) {
               System.out.print(i + " ");
           }
          
           System.out.println("\nSum of factors: " + sumOfFactors(list));
           System.out.println("Product of factors: " + productOfFactors(list));
           System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(list));
           sc.close();
       }
   }

   public static int[] factorize(int number) {
       int count = 0;
       int index = 0;

       for (int i = 1; i <= number; i++) {
           if (number % i == 0) {
               count++;
           }
       }

       int[] factors = new int[count];

       for (int i = 1; i <= number; i++) { 
           if (number % i == 0) {
               factors[index] = i;
               index++;
           }
       }

       return factors;
   }

   public static int sumOfFactors(int[] factors) {
       int sum = 0;
       for (int factor : factors) {
           sum += factor;
       }
       return sum;
   }

   public static long productOfFactors(int[] factors) {
       long product = 1;
       for (int factor : factors) {
           product *= factor;
       }
       return product;
   }

   public static double sumOfSquaresOfFactors(int[] factors) {
       double sum = 0;
       for (int factor : factors) {
           sum += Math.pow(factor, 2);
       }
       return sum;
   }
}