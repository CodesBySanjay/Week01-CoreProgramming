import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(leapYearCheck(year)==true) System.out.println("Is a leap year");
        else System.out.println("Not a leap year");
        System.out.println();
        sc.close();
    }
    public static boolean leapYearCheck(int year){
        boolean check = false;
        if(year>=1582){
            if(year%400==0 || (year%4==0 && year%100!=0)){
                check = true;
            }
        }
        return check;
    }
}
