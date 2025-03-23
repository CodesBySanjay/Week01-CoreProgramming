import java.util.Scanner;

public class numCheckNew {
    public static int count(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static int[] digits(int number) {
        int length = count(number);
        int[] digits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int[] factors(int number) {
        int countFactors = 0;
        for (int i = 1; i <= number; i++) {  
            if (number % i == 0) {
                countFactors++;
            }
        }

        int index = 0;
        int[] factors = new int[countFactors];

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i; 
                index++;
            }
        }
        return factors;
    }
    public static int greatestFactor(int[] factors) {
        int great = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > great) {
                great = factors[i];
            }
        }
        return great;
    }
    public static int sum(int[] factors) {
        int sum = 0;
        for (int i =0; i< factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }
    public static int product(int[] factors) {
        int product = 1;
        for (int i =0; i< factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }
    public static int productCube(int[] factors) {
        int cube = 1;
        for (int i =0; i< factors.length; i++) {
            cube *= Math.pow(factors[i], 3);
        }
        return cube;
    }
    public static boolean perfectNumber(int number) {
        int sumOfDivisors = sum(factors(number)) - number;
        return number == sumOfDivisors;
    }
    public static boolean abundantNumber(int number) {
        int sumOfDivisors = sum(factors(number)) - number;
        return sumOfDivisors > number;
    }
    public static boolean deficientNumber(int number) {
        int sumOfDivisors = sum(factors(number)) - number;
        return sumOfDivisors < number;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean strongNumber(int number) {
        int sumOfFactorials = 0;
        int[] digitArray = digits(number);
        for (int digit : digitArray) {  
            sumOfFactorials += factorial(digit);
        }
        return sumOfFactorials == number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int[] factorArray = factors(num);
        int greatestFactor = greatestFactor(factorArray);
        int sumOfFactors = sum(factorArray);
        int productOfFactors = product(factorArray);
        int productCubeOfFactors = productCube(factorArray);
        boolean isPerfect = perfectNumber(num);
        boolean isAbundant = abundantNumber(num);
        boolean isDeficient = deficientNumber(num);
        boolean isStrong = strongNumber(num);

        
        System.out.println("Factors:");
        for (int i =0; i< factorArray.length; i++) {
            System.out.print(factorArray[i] + " ");
        }

        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum: " + sumOfFactors);
        System.out.println("Product: " + productOfFactors);
        System.out.println("Product of Cubes: " + productCubeOfFactors);
        System.out.println("Perfect Number? " + isPerfect);
        System.out.println("Abundant Number? " + isAbundant);
        System.out.println("Deficient Number? " + isDeficient);
        System.out.println("Strong Number? " + isStrong);

        scan.close();
    }
}