import java.util.Scanner;
public class BMICalculator {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal weight";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.format("%.1f cm", data[i][1]);
            result[i][1] = String.format("%.1f kg", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void displayResults(String[][] results) {
        System.out.printf("%-12s %-12s %-12s %-15s%n", "Height", "Weight", "BMI", "Status");
        System.out.println("-------------------------------------------------------");
        for (String[] person : results) {
            System.out.printf("%-12s %-12s %-12s %-15s%n", person[0], person[1], person[2], person[3]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        scanner.close();
        String[][] results = calculateBMI(data);
        displayResults(results);
    }
}