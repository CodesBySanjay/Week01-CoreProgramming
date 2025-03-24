import java.util.Scanner;
public class UniqueCharacterFrequency {
    public static char[] findUniqueCharacters(String text) {
        int length = 0;
        try {
            while (true) text.charAt(length++);
        } catch (IndexOutOfBoundsException e) {}
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) uniqueChars[uniqueCount++] = current;
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) result[i] = uniqueChars[i];
        return result;
    }
    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];
        int length = 0;
        try {
            while (true) freq[text.charAt(length++)]++;
        } catch (IndexOutOfBoundsException e) {}
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        String[][] frequencies = findCharacterFrequency(input);
        System.out.println("Character Frequencies:");
        for (String[] pair : frequencies) System.out.println(pair[0] + ": " + pair[1]);
    }
}