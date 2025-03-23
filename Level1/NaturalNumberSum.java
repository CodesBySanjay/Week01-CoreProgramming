import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Sum of first "+number+" natural numbers is "+sum(number));
    }
    public static int sum(int n) {
        int total = 0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        return total;
    }
}