import java.util.Scanner;
public class NumberOperations {
    public static boolean isPositive(int number) {
        return number>0;
    }
    public static boolean isEven(int number) {
        return number%2==0;
    }
    public static String compare(int n1, int n2) {
        return ((n1>n2)?"First number is greater":((n1<n2)?"Last number is greater than first":"First and last numbers are equal"));
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] list = new int[5];
            for(int i=0;i<list.length;i++) list[i] = sc.nextInt();
            for(int num : list){
                if(isPositive(num)){
                    if(isEven(num)) System.out.println(num+" is positive and even.");
                    else System.out.println(num+" is positive and odd");
                }
                else System.err.println(num+" is negative or zero");
            }
            System.out.println(compare(list[0], list[4]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}