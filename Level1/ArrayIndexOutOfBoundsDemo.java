import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void generateAIOOBE(String[] arr) {
        System.out.println(arr[arr.length]);
    }
    public static void handleAIOOBE(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for(int i = 0; i < n; i++){
            names[i] = sc.next();
        }
        try {
            generateAIOOBE(names);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in generateAIOOBE: " + e);
        }
        handleAIOOBE(names);
        sc.close();
    }
}