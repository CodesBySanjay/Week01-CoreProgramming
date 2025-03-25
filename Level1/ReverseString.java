import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder();
            String text = sc.next();
            for(int i=text.length()-1;i>=0;i--){
                sb.append(text.charAt(i));
            }
            System.out.println("Reversed String: "+sb.toString());
        }
    }
}