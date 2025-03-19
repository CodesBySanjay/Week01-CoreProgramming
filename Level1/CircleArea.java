import java.util.Scanner;
public class CircleArea{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		float area = 3.14f * radius * radius;
		System.out.println("The area of the circle is "+area);
	}
}