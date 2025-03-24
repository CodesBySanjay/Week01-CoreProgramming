import java.util.Random;
import java.util.Scanner;
class StudentGrades {
    public static String[][] generateStudentScores(int numStudents) {
        Random rand = new Random();
        String[][] scores = new String[numStudents][6];

        for (int i = 0; i < numStudents; i++) {
            int physics = rand.nextInt(100) + 1;
            int chemistry = rand.nextInt(100) + 1;
            int math = rand.nextInt(100) + 1;
            int total = physics + chemistry + math;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            String grade = determineGrade(percentage);

            scores[i][0] = String.valueOf(physics);
            scores[i][1] = String.valueOf(chemistry);
            scores[i][2] = String.valueOf(math);
            scores[i][3] = String.valueOf(total);
            scores[i][4] = String.valueOf(percentage);
            scores[i][5] = grade;
        }
        return scores;
    }

    public static String determineGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    public static void displayStudentScores(String[][] scores) {
        System.out.println("\nPhysics\tChemistry\tMath\tTotal\tPercentage\tGrade");
        for (String[] row : scores) {
            System.out.println(row[0] + "\t" + row[1] + "\t\t" + row[2] + "\t" + row[3] + "\t" + row[4] + "%\t\t" + row[5]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        String[][] studentScores = generateStudentScores(numStudents);
        displayStudentScores(studentScores);
    }}