import java.util.Scanner;
class ShortestLongest {
    public static String[] findShortestLongest(String text) {
        String[] words = text.split(" ");
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        return new String[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] result = findShortestLongest(text);
        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}