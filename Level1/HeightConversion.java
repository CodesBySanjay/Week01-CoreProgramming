import java.util.Scanner;
public class HeightConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float cm = input.nextFloat();
		float inches = cm / 2.54f;
		float feet = inches / 12f;
		System.out.println("Your height in cm is "+cm+" while in feet is "+feet+" and inches is "+inches);
	}
}