import java.util.Scanner;
public class CompareStringArrays {
    public static char[] getChars(String s) {
        char[] r = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            r[i] = s.charAt(i);
        }
        return r;
    }
    public static boolean compareArrays(char[] a, char[] b) {
        if(a.length != b.length) return false;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] m = getChars(s);
        char[] b = s.toCharArray();
        System.out.println(compareArrays(m, b));
        sc.close();
    }
}