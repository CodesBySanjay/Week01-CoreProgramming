import java.util.Scanner;
public class DivisibilityCheck{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n%5==0){
			System.out.println("It is divisible");
		}
		else{
			System.out.println("It is not divisible");
		}
	}
}