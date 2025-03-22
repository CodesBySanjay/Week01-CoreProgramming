import java.util.Scanner;
public class NumberChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int [5];
		for (int i=0;i<numbers.length;i++){
			numbers[i] = sc.nextInt();
		}
		for(int i = 0; i<numbers.length;i++){
			if(numbers[i]>0 && numbers[i]%2==0){
				System.out.println(numbers[i]+" is positive and even");
			}
			else if(numbers[i]>0 && numbers[i]%2!=0){
				System.out.println(numbers[i]+" is positive and odd");
			}
			else if(numbers[i]<0){
				System.out.println(numbers[i]+" is negative");
			}
			else{
				System.out.println(numbers[i]+" is zero");
			}
		}
		if(numbers[0]==numbers[numbers.length]){
			System.out.println("The first and last numbers are equal");
		}
		else if(numbers[0]>numbers[numbers.length]){
			System.out.println("The first number is greater");
		}
		else{
			System.out.println("The last number is greater");
		}
	}
}