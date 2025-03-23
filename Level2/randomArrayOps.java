import java.util.Arrays;
import java.util.Scanner;
public class randomArrayOps {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of digits: ");
            int digits = sc.nextInt();
            int[] list = generate4DigitRandomArray(digits);
            System.out.println(list.toString());
            System.out.println("Average: "+findAverageMinMax(list)[0]+", Min: "+findAverageMinMax(list)[1]+", Max: "+findAverageMinMax(list)[1]);
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int[] generate4DigitRandomArray(int n){
        int[] list = new int[5];
        int min = (int)Math.pow(10, n-1);
        int max = (int)Math.pow(10,n)-1;
        for(int i=0;i<5;i++) list[i] = min + (int)(Math.random()*(max-min+1));
        return list;
    }
    public static double[] findAverageMinMax(int[] n){
        double avg = Arrays.stream(n).average().orElse(0);
        double min = Arrays.stream(n).min().orElse(Integer.MIN_VALUE);
        double max = Arrays.stream(n).max().orElse(Integer.MAX_VALUE);
        return new double[]{avg,min,min};
    }
}