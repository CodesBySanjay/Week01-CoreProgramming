import java.util.Scanner;
public class UpperCaseConversion {
    public static String manualToUpper(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                sb.append((char)(c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m = manualToUpper(s);
        String b = s.toUpperCase();
        System.out.println(compareStrings(m, b));
        sc.close();
    }
}