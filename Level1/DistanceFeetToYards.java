import java.util.Scanner;
public class DistanceFeetToYards{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float feet = input.nextFloat();
		float yards = feet / 3f;
		float miles = yards / 1760f;
		System.out.println("The distance in feet is "+feet+" while in yards is "+yards+" and miles is "+miles);
	}
}