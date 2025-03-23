import java.util.Scanner;
public class RoundsCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side1 = sc.nextFloat();
        float side2 = sc.nextFloat();
        float side3 = sc.nextFloat();
        System.out.println("Number of rounds: " + rounds(side1, side2, side3));
    }
    public static float rounds(float side1, float side2, float side3) {
        float perimeter = side1 + side2 + side3;
        float distance = 5000f;
        float rounds = distance/perimeter;
        return rounds;
    }
}