import java.util.Scanner;
class WordLengths {
    public static String[][] wordWithLength(String text) {
        String[] words = text.split(" ");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[][] wordLengths = wordWithLength(text);
        System.out.println("Word\tLength");
        for (String[] entry : wordLengths) {
            System.out.println(entry[0] + "\t" + entry[1]);
        }
    }
}