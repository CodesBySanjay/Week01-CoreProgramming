import java.util.Scanner;
public class FactorsOfNumberUsingWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int counter=1;
		if(number>0){
			while(counter<number){
				if(number%counter==0){
					System.out.println(counter);
					counter++;
				}
			}
		}
	}
}