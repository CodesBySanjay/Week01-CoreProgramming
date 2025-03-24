import java.util.Scanner;
class CharacterType {
    public static String[][] identifyCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                result[i][0] = String.valueOf(ch);
                result[i][1] = "aeiouAEIOU".indexOf(ch) != -1 ? "Vowel" : "Consonant";
            } else {
                result[i][0] = String.valueOf(ch);
                result[i][1] = "Not a Letter";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] results = identifyCharacters(text);
        System.out.println("Character\tType");
        for (String[] row : results) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}