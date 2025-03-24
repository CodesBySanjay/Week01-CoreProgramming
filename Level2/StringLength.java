import java.util.Scanner;
class StringLength {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int length = findLength(text);
        System.out.println("Length (Custom Method): " + length);
        System.out.println("Length (Built-in Method): " + text.length());
    }
}