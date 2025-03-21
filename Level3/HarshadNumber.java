import java.util.Scanner;
public class HarshadNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int originalNumber = number;
		while(number!=0){
			sum+=number%10;
			number = number/10;
		}
		if(originalNumber==sum){
			System.out.prinln("Harshad Number");
		}
		else{
			System.out.prinln("Not a Harshad Number");
		}
	}
}