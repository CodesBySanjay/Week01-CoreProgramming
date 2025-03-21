import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact=1;
		if (n>0){
			while(int i>1){
				fact*=i;
				i--;
			}
			System.out.println("The factorial is "+fact);
		}	
	}
}