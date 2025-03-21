import java.util.Scanner;
public class FizzBuzzUsingWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("Enter a number to check: ");
		int checkNum = sc.nextInt();
		if (checkNum>0){
			if(checkNum%3==0&&checkNum%5==0){
				int i=checkNum;
				while(i>0){
					System.out.println("FizzBuzz");
					i--;
				}
			}
			else if (checkNum%3==0){
				int i=checkNum;
				while(i>0){
					System.out.println("FizzBuzz");
					i--;
				}
			}
			else if (checkNum%5==0){
				int i=checkNum;
				while(i>0){
					System.out.println("FizzBuzz");
					i--;
				}
			}
			else{
				int i=checkNum;
				while(i>0){
					System.out.println(number);
					i--;
				}
			}
		}
	}
}