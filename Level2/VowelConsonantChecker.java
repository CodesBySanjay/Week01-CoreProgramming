import java.util.Scanner;
public class VowelConsonantChecker {
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } 
        return "Not a Letter";
    }
    public static String[][] analyzeString(String str) {
        int length = str.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }
    public static void displayResult(String[][] array) {
        System.out.println("\nCharacter | Type");
        System.out.println("-----------------");
        for (String[] row : array) {
            System.out.printf("%9s | %s%n", row[0], row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] analyzedData = analyzeString(input);
        displayResult(analyzedData);

        scanner.close();
    }
}