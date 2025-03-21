import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int originalNumber = number;
		while(originalNumber!=0){
			sum += Math.pow((number%10),3);
			originalNumber = number/10;
		}
		if(number==sum){
			System.out.println("It is an Armstrong number");
		}
		else{
			System.out.println("It is not an Armstrong number");
		}
	}
}