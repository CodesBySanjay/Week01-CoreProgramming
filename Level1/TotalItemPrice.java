import java.util.Scanner;
public class TotalItemPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float unitPrice = input.nextFloat();
		int quantity = input.nextInt();
		float total = unitPrice * (float) quantity;
		System.out.println("The total purchase price is INR "+total+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
	}
}