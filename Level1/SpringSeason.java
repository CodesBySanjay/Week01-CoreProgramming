import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the month: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of the day: ");
        int d = sc.nextInt();
        System.out.println(springCheck(m,d));
    }
    public static String springCheck(int m, int d) {
        if((m==3 && d>=20) || (m>3 && m<6) || (m==6 && m<=20)){
            return "It's a Spring Season";
        }
        else return "Not a Spring Season";
    }
}