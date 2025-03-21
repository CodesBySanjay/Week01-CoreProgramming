import java.util.Scanner;
public class FactorialUsingFor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact=1;
		if (n>0){
			for(int i=n;i>1;i--){
				fact*=i;
			}
			System.out.println("The factorial is "+fact);
		}
		else{
			System.out.println("Not a natural number");
		}	
	}
}