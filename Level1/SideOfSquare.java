import java.util.Scanner;
public class SideOfSquare{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float perimeter = input.nextFloat();
		float side = perimeter / 4f;
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}