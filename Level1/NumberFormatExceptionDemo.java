import java.util.Scanner;
public class NumberFormatExceptionDemo {
    public static void generateNFE(String s) {
        System.out.println(Integer.parseInt(s));
    }
    public static void handleNFE(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            generateNFE(s);
        } catch(NumberFormatException e) {
            System.out.println("Exception in generateNFE: " + e);
        }
        handleNFE(s);
        sc.close();
    }
}