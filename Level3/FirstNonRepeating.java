import java.util.Scanner;
public class FirstNonRepeating {
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        int length = 0;
        try {
            while (true) {
                freq[text.charAt(length)]++;
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        for (int i = 0; i < length; i++) if (freq[text.charAt(i)] == 1) return text.charAt(i);
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        char result = findFirstNonRepeating(input);
        if (result != '\0') System.out.println("First non-repeating character: " + result);
        else System.out.println("No non-repeating character found.");
    }
}