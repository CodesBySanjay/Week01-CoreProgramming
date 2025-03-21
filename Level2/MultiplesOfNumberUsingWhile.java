import java.util.Scanner;
public class MultiplesOfNumberUsingWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int counter = number-1;
		if(number>0&&number<100){
			while(counter>1){
				if(number%counter==0){
					System.out.println(counter);
				}
			}
		}
	}
}