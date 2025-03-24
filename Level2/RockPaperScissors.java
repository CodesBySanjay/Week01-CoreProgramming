import java.util.Random;
import java.util.Scanner;
class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }
    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User Wins";
        }
        return "Computer Wins";
    }
    public static String[][] playGame(int rounds) {
        Scanner sc = new Scanner(System.in);
        String[][] results = new String[rounds][3];
        int userWins = 0, computerWins = 0;
        for (int i = 0; i < rounds; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = sc.next();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
            if (winner.equals("User Wins")) userWins++;
            if (winner.equals("Computer Wins")) computerWins++;
        }
        return formatResults(results, userWins, computerWins, rounds);
    }
    public static String[][] formatResults(String[][] results, int userWins, int compWins, int rounds) {
        String[][] finalResults = new String[rounds + 2][3];
        for (int i = 0; i < rounds; i++) {
            finalResults[i] = results[i];
        }
        finalResults[rounds][0] = "User Wins %";
        finalResults[rounds][1] = "Computer Wins %";
        finalResults[rounds][2] = "Draws %";

        finalResults[rounds + 1][0] = String.format("%.2f", ((double) userWins / rounds) * 100) + "%";
        finalResults[rounds + 1][1] = String.format("%.2f", ((double) compWins / rounds) * 100) + "%";
        finalResults[rounds + 1][2] = String.format("%.2f", ((double) (rounds - userWins - compWins) / rounds) * 100) + "%";
        return finalResults;
    }
    public static void displayResults(String[][] results) {
        System.out.println("\nUser\tComputer\tResult");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();
        String[][] gameResults = playGame(rounds);
        displayResults(gameResults);
    }
}