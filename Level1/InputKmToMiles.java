import java.util.Scanner;
public class InputKmToMiles{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double km = input.nextDouble();
		double mile = 0.621371 * km;
		System.out.println("The total miles is "+mile+" for the given "+km+" km");
	}
}