import java.util.Scanner;
public class CharacterFrequency {
    public static Object[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];
        int length = 0;
        try {
            while (true) {
                freq[text.charAt(length)]++;
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        Object[][] result = new Object[length][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = ch;
                result[index][1] = freq[ch];
                freq[ch] = 0;
                index++;
            }
        }
        Object[][] finalResult = new Object[index][2];
        for (int i = 0; i < index; i++) finalResult[i] = result[i];
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        Object[][] frequencies = findCharacterFrequency(input);
        System.out.println("Character Frequencies:");
        for (Object[] pair : frequencies) System.out.println(pair[0] + ": " + pair[1]);
    }
}