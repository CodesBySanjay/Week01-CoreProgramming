import java.util.Scanner;
public class BmiChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        double[] weights = new double[persons];
        double[] heights = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];
        for(int i=0;i<persons;i++){
            System.out.print("Weight: ");
            weights[i] = sc.nextDouble();
            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
            bmi[i] = weights[i]/((heights[i]*0.01)*(heights[i]*0.01);
            if(bmi[i]<=18.4) status[i]="Underweight";
            else if(bmi[i]>18.5 && bmi[i]<=24.9) status[i]="Normal";
            else if(bmi[i]>25.0 && bmi[i]<=39.9) status[i]="Overweight";
            else status[i]="Obese";
        }
        for(int i=0;i<persons;i++){
            System.out.println("Person "+(i+1)+" Data - Height: "+heights[i]+", Weight: "+weights[i]+", BMI: "+bmi[i]+", Weight Status: "+status[i]);        }
        sc.close();
    }
}