import java.util.Scanner;
public class YoungestAndTallest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		int height1 = sc.nextInt();
		int height2 = sc.nextInt();
		int height3 = sc.nextInt();
		int youngest = (age1<age2&&age1<age3)?age1:((age2<age1&&age2<age3)?age2:((age3<age1&&age3<age2)?age3:"Equal ages"));
		int tallest = (height1>height2&&height1>height3)?height1:((height2>height1&&height2>height3)?height2:((height3>height1&&height3>height2)?height3:"Equal heights"));
	}
}