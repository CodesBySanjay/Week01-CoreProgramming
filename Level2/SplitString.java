import java.util.ArrayList;
import java.util.Scanner;
class SplitString {
    public static String[] splitWords(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] customSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");
        System.out.println("Custom Split: " + String.join(", ", customSplit));
        System.out.println("Built-in Split: " + String.join(", ", builtInSplit));
    }
}