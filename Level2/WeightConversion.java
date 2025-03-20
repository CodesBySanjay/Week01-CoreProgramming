import java.util.Scanner;
public class WeightConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float weight = sc.nextFloat();
		System.out.println("The weight of the person in pounds is "+weight+" and in kg is "+(weight/2.2f));
	}
}