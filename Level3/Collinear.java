import java.util.Scanner;
public class Collinear{
	public static boolean isCollinear(int x1,int x2,int x3,int y1,int y2,int y3)
	{
		double slopeAB=(y2-y1)/(x2-x1);
		double slopeBC=(y3-y2)/(x3-x2);
		double slopeAC=(y3-y1)/(x3-x1);
		return (slopeAB==slopeBC)&&(slopeBC==slopeAC);
	}
	public static boolean areaOfTriangle(int x1,int x2,int x3,int y1,int y2,int y3)
	{
		return (0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)))==0;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter value of x1:");
		int x1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter value of x2:");
		int x2=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter value of x3:");
		int x3=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter value of y1:");
		int y1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter value of y2:");
		int y2=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter value of y3:");
		int y3=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.println("Using Slope formula:"+(isCollinear(x1,x2,x3,y1,y2,y3)?"Points are collinear":"Points are not collinear"));
		System.out.println("Using Area of Triangle formula:"+(areaOfTriangle(x1,x2,x3,y1,y2,y3)?"Points are collinear":"Points are not collinear"));
	}
}