import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		String check = (((month==3&&day>=20)||(month==7&&day<21))?"It's a Spring Season":"Not a Spring Season");
	}
}