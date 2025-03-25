import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            System.out.print("Enter character to remove: ");
            char ch = sc.next().charAt(0);
            
            System.out.println("Modified String: " + removeCharacter(input, ch));
        }
    }

    public static String removeCharacter(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }
}