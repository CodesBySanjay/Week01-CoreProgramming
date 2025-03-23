import java.util.Scanner;
import java.lang.Math;
public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Smallest: "+finder(n1,n2,n3)[0]+"   Largest: "+finder(n1,n2,n3)[1]);
    }
    public static int[] finder(int n1, int n2, int n3) {
        int smallest=Math.min(n1,Math.min(n2,n3));
        int largest=Math.max(n1,Math.max(n2,n3));
        // if(n1>n2&&n1>n3){
        //     if(n2>n3){
        //         largest = n1;
        //         smallest = n3;
        //     }
        //     else if(n3>n2){
        //         largest = n1;
        //         smallest = n2;
        //     }
        //     else{
        //         largest = n1;
        //     }
        // }
        // else if(n2>n1&&n2>n3){
        //     if(n1>n3){
        //         largest = n2;
        //         smallest = n3;
        //     }
        //     else if(n3>n1){
        //         largest = n2;
        //         smallest = n1;
        //     }
        //     else{
        //         largest = n2;
        //     }
        // }
        // else if(n3>n2&&n3>n1){
        //     if(n3>n1){
        //         largest = n3;
        //         smallest = n1;
        //     }
        //     else if(n3>n2){
        //         largest = n3;
        //         smallest = n2;
        //     }
        //     else{
        //         largest = n3;
        //     }
        // }
        return new int[]{smallest,largest};
    }
}