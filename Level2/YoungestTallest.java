import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        int tallest=0;
        for(int i=0;i<3;i++){
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
            if(height[i]>=tallest) tallest=height[i];
        }
        int youngest = age[0];
        for(int i=0;i<3;i++){
            if(age[i]<=youngest){
                youngest = age[i];
            }
        }
        System.out.println("The youngest is : "+youngest);
        System.out.println("The tallest is: "+tallest);
        sc.close();
    }
}