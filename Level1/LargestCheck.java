import java.util.Scanner;
public class LargestCheck{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		String result = ((number1>number2&&number1>number3)? "First number is the largest":((number2>number1&&number2>number3)?"Second number is the largest"):((number3>number1&&number3>number2)?"Third number is the largest":"All numbers are equal"));
		System.out.println(result);
	}
}