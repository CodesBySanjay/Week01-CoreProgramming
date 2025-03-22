import java.util.Scanner;
public class MeanHeightCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mean, sum=0.0;
        double[] heights = new double[11];
        for(int i=0;i<11;i++){
            heights[i] = sc.nextDouble();
            sum+=heights[i];
        }
        mean = sum/11;
        System.out.println("Mean height of football team is "+mean);
        sc.close();
    }
}
