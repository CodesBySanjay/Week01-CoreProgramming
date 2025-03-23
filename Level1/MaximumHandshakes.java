import java.util.Scanner;
public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        System.out.println("Maximum handshakes: " + maxHandshakes(students));
    }
    public static int maxHandshakes(int n) {
        int max = (n * (n - 1)) / 2;
        return max;
    }
}