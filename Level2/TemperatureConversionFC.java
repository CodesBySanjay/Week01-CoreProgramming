import java.util.Scanner;
public class TemperatureConversionFC{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float farenheit = sc.nextFloat();
		float celsiusResult = (farenheit - 32f) * 5f/9f;
		System.out.println("The "+farenheit+" farenheit is "+celsiusResult+" celsius");
	}
}