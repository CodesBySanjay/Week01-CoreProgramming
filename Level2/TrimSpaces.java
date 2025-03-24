import java.util.Scanner;
class TrimSpaces {
    public static String trimCustom(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return text.substring(start, end + 1);
    }
    public static boolean compareTrimmed(String original, String trimmed) {
        return original.trim().equals(trimmed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();
        String trimmedText = trimCustom(text);
        System.out.println("Trimmed Text: '" + trimmedText + "'");
        System.out.println("Matches Built-in trim()? " + compareTrimmed(text, trimmedText));
    }
}