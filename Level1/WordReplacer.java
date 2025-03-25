import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sc.nextLine();
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter replacement word: ");
        String newWord = sc.next();

        System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord));

        sc.close();
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}