import java.util.Scanner;
public class LeapYearCheckSingleIfBlock{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year>=1582 && ((year%400==0) || (year%4==0 && year%100!=0)){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is not a leap year");
		}
	}
}