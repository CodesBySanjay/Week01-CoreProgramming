import java.util.Scanner;
public class FizzBuzzUsingFor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("Enter a number to check: ");
		int checkNum = sc.nextInt();
		if (checkNum>0){
			if(checkNum%3==0&&checkNum%5==0){
				for(int i=1;i<=checkNum;i++){
					System.out.println("FizzBuzz");
				}
			}
			else if (checkNum%3==0){
				for(int i=1;i<=checkNum;i++){
					System.out.println("Fizz");
				}
			}
			else if (checkNum%5==0){
				for(int i=1;i<=checkNum;i++){
					System.out.println("Buzz");
				}
			}
			else{
				for(int i=1;i<=checkNum;i++){
					System.out.println(number);
				}
			}
		}
	}
}