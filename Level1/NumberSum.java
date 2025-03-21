import java.util.Scanner;
public class NumberSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		System.out.print("Enter any number or 0 to stop");
		double temp = sc.nextDouble();
		while(temp!=0){
			total+=temp;
			System.out.print("Enter any number or 0 to stop");
			temp = sc.nextDouble();
		}
		System.out.println("Total = "+total);
	}
}