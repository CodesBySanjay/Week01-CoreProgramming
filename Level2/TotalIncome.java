import java.util.Scanner;
public class TotalIncome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float salary = sc.nextFloat();
		float bonus = sc.nextFloat();
		float income = salary + bonus;
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
	}
}