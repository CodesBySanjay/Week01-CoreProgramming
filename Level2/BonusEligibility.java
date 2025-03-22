import java.util.Scanner;
public class BonusEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] oldSalary = new double[10];
        double[] years = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double sal, yr, totalBonus=0.0, totalOldSalary=0.0, totalNewSalary=0.0;
        int i=0,j=0;
        while(i<10){
            sal = sc.nextDouble();
            yr = sc.nextDouble();
            if(sal>0.0 && yr>0.0){
                oldSalary[i]=sal;
                years[i]=yr;
                i++;
            }
            else{
                System.out.println("Enter proper values...");
            }
        }
        while(j<10){
            if(years[j]>5.0){
                bonus[j] = oldSalary[j]*0.05;
            }
            else if(years[j]<5.0){
                bonus[j] = oldSalary[j]*0.02;
            }
            totalBonus += bonus[j];
            totalOldSalary += oldSalary[j];
            newSalary[j] = oldSalary[j]+bonus[j];
            totalNewSalary += newSalary[j];
            j++;
        }
        System.out.println("Total bonus payout = "+totalBonus);
        System.out.println("Total old salary = "+totalOldSalary);
        System.out.println("Total new salary = "+totalNewSalary);
        sc.close();
    }
}