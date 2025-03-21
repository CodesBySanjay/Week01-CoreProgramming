import java.util.Scanner;
public class GreatestFactorUsingWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int counter = number-1;
		int greatestFactor=1;
		while(counter!=1){
			if(number%counter==0){
				greatestFactor = counter;
				counter--;
			}
		}
		System.out.println("The greatest factor is "+greatestFactor);
	}
}