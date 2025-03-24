import java.util.Scanner;
public class CreateSubstring {
    public static String subString(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First word: ");
        String str = sc.next();
        System.out.print("Starting index: ");
        int start = sc.nextInt();
        System.out.print("Ending index: ");
        int end = sc.nextInt();
        System.out.println(subString(str, start, end));
        sc.close();
    }
}