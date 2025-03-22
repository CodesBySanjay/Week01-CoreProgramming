import java.util.Scanner;
public class BmiChecker2DArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i=0;
        double wt,ht,bmi;
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        while(i!=number){
            System.out.print("Weight: ");
            wt = sc.nextDouble();
            System.out.print("Height: ");
            ht = sc.nextDouble();
            if(wt>0 && ht>0){
                bmi = wt/((ht*0.01)*(ht*0.01));
                if(bmi<=18.4) weightStatus[i]="Underweight";
                else if(bmi>18.5 && bmi<=24.9) weightStatus[i]="Normal";
                else if(bmi>25.0 && bmi<=39.9) weightStatus[i]="Overweight";
                else weightStatus[i]="Obese";
                personData[i][0] = wt;
                personData[i][1] = ht;
                personData[i][2] = bmi;
                i++;
            }
            else{
                System.out.println("Enter valid values...");
            }

        }
        for(int j=0;j<number;j++){
            System.out.println("Person "+(j+1)+" Data - Height: "+personData[j][0]+", Weight: "+personData[j][1]+", BMI: "+personData[j][2]+", Status: "+weightStatus[j]);
        }
        sc.close();
    }
}