import java.util.Scanner;
public class BonusEligibility{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float salary = sc.nextFloat();
		int years = sc.nextInt();
		if (years>5){
			float bonusAmount = salary + (salary*0.05f);
			System.out.println("The bonus amount is "+bonusAmount);
		}
		else{
			System.out.println("You have less than 5 years of experience. Not eligible for a bonus.");
		}
	}
}