public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit * fahrenheit2celsius;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius * celsius2fahrenheit;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        System.out.println("100 fahrenheit to celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("100 celsius to fahrenheit: " + convertCelsiusToFahrenheit(100));
        System.out.println("100 pounds to kilogams: " + convertPoundsToKilograms(100));
        System.out.println("100 kilograms to pounds: " + convertKilogramsToPounds(100));
        System.out.println("100 gallons to liters: " + convertGallonsToLiters(100));
        System.out.println("100 liters to gallons: " + convertLitersToGallons(100));
    }
}