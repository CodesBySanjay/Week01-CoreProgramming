import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] list = new String[number+1];
        if(number>0){
            for(int i=0;i<=number;i++){
                if(i==number) list[i]=String.valueOf(number);
                if(i%3==0 && i%5==0){
                    list[i]="FizzBuzz";
                }
                else if(i%3==0){
                    list[i]="Fizz";
                }
                else if(i%5==0){
                    list[i]="Buzz";
                }
                else{
                    list[i]=String.valueOf(i);
                }
            }
        }
        for(int i=0;i<list.length;i++){
            System.out.println("Position "+i+" = "+list[i]);
        }
        sc.close();
    }
}