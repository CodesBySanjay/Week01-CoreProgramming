import java.util.Scanner;
public class UniqueCharacters {
    public static int getStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return length;
    }
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        char[] uniqueCharacters = findUniqueCharacters(input);
        System.out.print("Unique characters: ");
        for (char c : uniqueCharacters) System.out.print(c + " ");
    }
}