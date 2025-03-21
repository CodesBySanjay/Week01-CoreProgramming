import java.util.Scanner;
public class SmallestCheck{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		boolean result = ((number1<number2&&number1<number3)? true:false);
		System.out.println(result);
	}
}