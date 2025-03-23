import java.util.Scanner;
import java.lang.Math;
public class WindChillTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter the wind speed: ");
        double windSpeed = sc.nextDouble();
        System.out.println("Wind chill temperature: " + calculateWindChill(temperature, windSpeed));
    }
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}