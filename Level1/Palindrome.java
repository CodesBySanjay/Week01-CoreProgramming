import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder();
            String text = sc.next();
            text = text.toLowerCase();
            for(int i=text.length()-1;i>=0;i--){
                sb.append(text.charAt(i));
            }
            String reverse = sb.toString();
            if(text.equals(reverse)) System.out.println("Is a palindrome");
            else System.out.println("Not a palindrome");
        }
    }
}