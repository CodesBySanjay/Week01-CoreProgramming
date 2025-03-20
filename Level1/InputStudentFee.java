import java.util.Scanner;
public class InputStudentFee{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
		int discountPercent = input.nextInt();
		float discount = (float) fee - (fee/discountPercent);
		System.out.println("The discount amount is INR "+discountPercent+" and final discounted fee is INR "+discount);
	}
}