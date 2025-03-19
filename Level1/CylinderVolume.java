import java.util.Scanner;
public class CylinderVolume{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		float height = sc.nextFloat();
		float volume = 3.14f * radius * radius * height;
		System.out.println("The volume of the cylinder is "+volume);
	}
}