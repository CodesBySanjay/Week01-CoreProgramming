import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(check(number));
    }
    public static float check(int n) {
        int result = ((n>0)?1:((n<0)?-1:0));
        return result;
    }
}