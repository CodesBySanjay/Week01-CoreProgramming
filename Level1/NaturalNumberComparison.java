import java.util.Scanner;
public class NaturalNumberComparison{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int sum1=0, sum2=0;
		if (n>0){
			while(i<=n){
				sum1+=i;
				i++;
			}
			sum2 = n*(n+1)/2;
			System.out.println((sum1==sum2)?"Both sums are equal":"The sums are not equal");
			System.out.println("Sum 1 : "+sum1+"\nSum 2: "+sum2);
		}
		else{
			System.out.println("It is not a natural number");
		}
	}
}