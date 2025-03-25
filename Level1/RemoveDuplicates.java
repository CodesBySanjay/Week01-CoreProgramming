import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            boolean[] visited = new boolean[256];
            String text = sc.next();
            text = text.toLowerCase();
            StringBuilder unique = new StringBuilder();
            for(int i=0;i<text.length();i++){
                if(!visited[text.charAt(i)]){
                    unique.append(text.charAt(i));
                    visited[text.charAt(i)] = true;
                }
            }
            System.out.println("Without duplicates: "+unique.toString());
        }
    }
}