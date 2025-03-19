import java.util.Scanner;
public class AverageCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float average = (n1+n2+n3)/3f;
		System.out.println("The average of three numbers is "+average);
	}
}