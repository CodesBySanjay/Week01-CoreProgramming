import java.util.Random;
import java.util.Scanner;
class VotingEligibility {
    public static int[] generateAges(int numStudents) {
        Random rand = new Random();
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = rand.nextInt(41) + 10; // Age between 10 and 50
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "True" : "False";
        }
        return result;
    }
    public static void displayResults(String[][] results) {
        System.out.println("Age\tCan Vote");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        int[] ages = generateAges(numStudents);
        String[][] results = checkVotingEligibility(ages);
        displayResults(results);
    }
}
