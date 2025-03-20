import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float add = number1+number2;
		float subtract = number1-number2;
		float multiply = number1*number2;
		float divide = number1/number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+add+", "+subtract+", "+multiply+", "+divide);
	}
}