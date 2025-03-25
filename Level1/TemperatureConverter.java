import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char choice = sc.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.println("Temperature in Celsius: " + toCelsius(temp));
        } else if (choice == 'F') {
            System.out.println("Temperature in Fahrenheit: " + toFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}