import java.util.Scanner;
public class QuotientRemainder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float number1 = sc.nextFloat();
		float number2 = sc.nextFloat();
		System.out.print("The Quotient is "+(number1/number2)+" and Remainder is "+(number1%number2)+" of two numbers "+number1+" and "+number2);
	}
}