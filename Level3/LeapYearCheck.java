import java.util.Scanner;
public class LeapYearCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		while(true){
			if(year>=1582){
				if(year%400==0){
					System.out.println("It is a leap year");
					break;
				}
				else if(year%4==0&&year%100!=0){
					System.out.println("It is a leap year");
					break;
				}
				else{
					System.out.println("It is not a leap year");
					break;
				}
			}
			else{
				System.out.println("Please enter a year over 1582...");
			}
		}
	}
}