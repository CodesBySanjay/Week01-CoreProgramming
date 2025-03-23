import java.util.Scanner;
public class SimpleInterest{
	public float si(float a,float b, float c){
		float simpleInterest = a * b * c / 100;
		return simpleInterest;
	}
	public static void main(String[] args){
		SimpleInterest simpleinterest = new SimpleInterest();
		Scanner sc = new Scanner(System.in);
		float principal = sc.nextFloat();
		float rate = sc.nextFloat();
		float time = sc.nextFloat();

		System.out.println("The simple interest is "+simpleinterest.si(principal,rate,time)+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
}