import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    public static void generateSIOOBE(String s) {
        System.out.println(s.charAt(s.length()));
    }
    public static void handleSIOOBE(String s) {
        try {
            s.charAt(s.length());
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            generateSIOOBE(s);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
        handleSIOOBE(s);
        sc.close();
    }
}