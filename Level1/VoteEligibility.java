import java.util.Scanner;
public class VoteEligibility{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (n>=18){
			System.out.println("The person's age is "+age+" and can vote");
		}
		else{
			System.out.println("The person's age is "+age+" and can't vote");
		}
	}
}