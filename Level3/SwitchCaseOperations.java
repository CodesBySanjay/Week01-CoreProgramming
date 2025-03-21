import java.util.Scanner;
public class SwitchCaseOperations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		String op = sc.nextLine();
		switch(op){
		case "+":
			System.out.println(first+" + "+second+" = "+(first+second));
			break;
		case "-":
			System.out.println(first+" - "+second+" = "+(first-second));
			break;
		case "*":
			System.out.println(first+" * "+second+" = "+(first*second));
			break;
		case "/":
			System.out.println(first+" / "+second+" = "+(first/second));
			break;
		default:
			System.out.println("Invalid operator");
		}
	}
}