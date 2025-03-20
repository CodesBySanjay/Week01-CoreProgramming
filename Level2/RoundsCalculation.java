import java.util.Scanner;
public class RoundsCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float side1 = sc.nextFloat();
		float side2 = sc.nextFloat();
		float side3 = sc.nextFloat();
		float perimeter = side1 + side2 + side3;
		float distance = 5000f;
		float rounds = distance/perimeter;
		System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
	}
}