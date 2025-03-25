import java.util.*;
public class VowelConsonantCount{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int vowelCount=0;
            int consonantCount=0;
            String text = sc.next();
            text = text.toLowerCase();
            for(int i=0;i<text.length();i++){
                char ch = text.charAt(i);
                if(Character.isLetter(ch)){
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowelCount++;
                    else consonantCount++;
                }
            }
            System.out.println("Vowel count = "+vowelCount);
            System.out.println("Consonant count = "+consonantCount);
        }
    }
}