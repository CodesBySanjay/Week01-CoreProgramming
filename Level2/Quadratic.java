import java.util.Arrays;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double roots[] = rootsFinder(a, b, c);
            System.out.println("The roots are: "+Arrays.toString(roots));
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static double[] rootsFinder(double a, double b, double c){
        double delta = Math.pow(b,2) - 4 * a * c;
        double[] roots;
        if(delta>0){
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta))/(2*a);
            roots[1] = (-b - Math.sqrt(delta))/(2*a);
        }
        else if(delta==0){
            roots = new double[1];
            roots[0] = (-b)/(2*a);
        }
        else{
            roots = new double[0];
        }
        return roots;
    }
}