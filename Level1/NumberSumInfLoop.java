import java.util.Scanner;
public class NumberSumInfLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		while(true){
			System.out.print("Enter any positive/negative number or 0: ");
			double temp = sc.nextDouble();
			if(temp<=0){
				break;
			}
			total+=temp;
		}
		System.out.println("Total = "+total);
	}
}