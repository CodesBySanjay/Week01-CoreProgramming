import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    public static void generateIAE(String s) {
        System.out.println(s.substring(5, 3));
    }
    public static void handleIAE(String s) {
        try {
            s.substring(5, 3);
        } catch(IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            generateIAE(s);
        } catch(IllegalArgumentException e) {
            System.out.println("Exception: " + e);
        }
        handleIAE(s);
        sc.close();
    }
}