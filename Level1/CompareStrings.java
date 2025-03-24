import java.util.Scanner;
public class CompareStrings {
    public static boolean compare(String s1, String s2) {
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)) return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First word: ");
        String s1 = sc.next();
        System.out.print("Second word: ");
        String s2 = sc.next();
        System.out.println(compare(s1, s2));
        sc.close();
    }
}