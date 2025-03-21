import java.util.Scanner;
public class NaturalNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum;
		if (n>0){
			for(int i=1;i<=n;i++){
				sum+=i;
			}
			System.out.println("The sum of "+n+" natural numbers is "+sum);
		}
		else{
			System.out.println("The number "+n+" is not a natural number");
		}
	}
}