import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate salary & years of service
        double[][] salaryData = generateSalaryAndYears(numEmployees);

        // Step 2: Calculate bonus & new salary
        double[][] updatedData = calculateBonusAndNewSalary(salaryData);

        // Step 3: Display everything in a table
        displaySalaryTable(salaryData, updatedData);
    }

    // Method to generate random salaries and years of service
    public static double[][] generateSalaryAndYears(int employees) {
        Random rand = new Random();
        double[][] data = new double[employees][2]; // Stores [old salary, years of service]

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // Random salary (10000 - 99999)
            data[i][1] = 1 + rand.nextInt(10); // Random years of service (1 to 10)
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] salaryData) {
        int employees = salaryData.length;
        double[][] updatedData = new double[employees][2]; // Stores [new salary, bonus]

        for (int i = 0; i < employees; i++) {
            double oldSalary = salaryData[i][0];
            int yearsOfService = (int) salaryData[i][1];

            double bonusPercent = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercent;
            double newSalary = oldSalary + bonusAmount;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonusAmount;
        }
        return updatedData;
    }

    // Method to display salary details in a table
    public static void displaySalaryTable(double[][] salaryData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Print table header
        System.out.printf("%-5s %-12s %-10s %-10s %-12s %-12s%n", 
                          "ID", "Old Salary", "Years", "Bonus %", "Bonus Amt", "New Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < salaryData.length; i++) {
            double oldSalary = salaryData[i][0];
            int years = (int) salaryData[i][1];
            double bonusAmount = updatedData[i][1];
            double newSalary = updatedData[i][0];
            double bonusPercent = (years > 5) ? 5 : 2;

            System.out.printf("%-5d %-12.2f %-10d %-10.0f %-12.2f %-12.2f%n", 
                              (i + 1), oldSalary, years, bonusPercent, bonusAmount, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;
        }

        // Print total amounts
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s %-12.2f %-10s %-10s %-12.2f %-12.2f%n", 
                          "Total", totalOldSalary, "-", "-", totalBonus, totalNewSalary);
    }
}