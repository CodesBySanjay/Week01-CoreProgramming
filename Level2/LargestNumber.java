import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int largest=0, secondLargest=0, index = 0,maxDigit = 10;
        int[] list = new int[maxDigit];
        while(number!=0){
            if(index==maxDigit) break;
            else{
                list[index]=(int) number%10;
                number/=10;
                index++;
            }
        }
        for(int i=0;i<list.length;i++){
            if(list[i]>largest){
                secondLargest = largest;
                largest = list[i];
            }
            else if(list[i]==secondLargest && list[i]!=largest){
                secondLargest = list[i];
            }
        }
        System.out.println("Largest digit is: "+largest);
        System.out.println("Second largest digit is: "+secondLargest);
        sc.close();
    }
}