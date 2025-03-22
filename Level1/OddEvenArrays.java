import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int even=0,odd=0;
        int evenSize = number/2;
        int oddSize = (number+1)/2;
        int[] evenArray = new int [evenSize];
        int[] oddArray = new int [oddSize];
        if(number<1){
            System.err.println("Need to enter a natural number");
            System.exit(0);
        }
        else{
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    evenArray[even] = i;
                    even++;
                }
                else{
                    oddArray[odd] = i;
                    odd++;
                }
            }
            System.out.print("Odd numbers are: ");
            for(odd=0;odd<oddSize;odd++){
                System.out.print(oddArray[odd]+" ");
            }
            System.out.println("");
            System.out.print("Even numbers are: ");
            for(even=0;even<evenSize;even++){
                System.out.print(evenArray[even]+" ");
            }
        }
        sc.close();
    }
}
