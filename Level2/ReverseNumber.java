import java.util.Scanner;
import java.lang.Math;
public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int count = (int) Math.log10(number)+1;
        int[] list = new int[count];
        for(int i=0;i<count;i++){
            list[i] = (int) number%10;
            number/=10;
        }
        System.out.print("Number in reverse is: ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]);
        }
        sc.close();
    }
}