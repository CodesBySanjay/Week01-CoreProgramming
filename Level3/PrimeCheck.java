import java.util.Scanner;
public class PrimeCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime;
		if(number==1){
			isPrime = true;;
		}
		else if(number==2){
			isprime = true;;
		}
		for(int i=2;i<number;i++){
			if(number%i==0){
				break
			}
			else{
				isPrime = true;
			}
		}
		System.out.println(isPrime);
		
	}
}