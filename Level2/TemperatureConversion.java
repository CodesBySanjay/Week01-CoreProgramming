import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float celsius = sc.nextFloat();
		float farenheitResult = (celsius * 9f/5f) + 32f;
		System.out.println("The "+celsius+" celsius is "+farenheitResult+" farenheit");
	}
}