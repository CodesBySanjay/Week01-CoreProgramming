import java.util.Scanner;
public class YoungestTallest {
    public static int youngest(int[] age) {
        int youngest = Math.min(age[0],Math.min(age[1],age[2]));
        return youngest;
    }
    public static int tallest(int[] height) {
        int tallest = Math.min(height[0],Math.min(height[1],height[2]));
        return tallest;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] age = new int[3];
            int[] height = new int[3];
            System.out.println("Enter the ages: ");
            for(int i=0;i<age.length;i++) age[i]=sc.nextInt();
            System.out.println("Enter the heights: ");
            for(int i=0;i<height.length;i++) height[i]=sc.nextInt();
            System.out.println("The youngest age is: "+youngest(age));
            System.out.println("The tallest height is: "+tallest(height));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}