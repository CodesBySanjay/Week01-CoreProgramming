import java.util.Scanner;
import java.lang.Math;
public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double degreeAngle = sc.nextDouble();
        double radianAngle = degreeAngle * Math.PI/180;
        System.out.println("Sine: " + calculateTrigonometricFunctions(radianAngle)[0]+", Cosine: "+calculateTrigonometricFunctions(radianAngle)[1]+", Tangent: "+calculateTrigonometricFunctions(radianAngle)[2]);
    }
    public static double[] calculateTrigonometricFunctions(double radianAngle) {
        double sine = Math.sin(radianAngle);
        double cosine = Math.cos(radianAngle);
        double tangent = Math.tan(radianAngle);
        return new double[] {sine, cosine, tangent};
    }
}