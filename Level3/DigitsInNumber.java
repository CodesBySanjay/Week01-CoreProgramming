import java.util.Scanner;
public class DigitsInNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int count = 0;
		while(temp!=0){
			temp/=10;
			count++;
		}
		System.out.println("Total number of digits in number is "+count);
	}
}