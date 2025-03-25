import java.util.Scanner;
class LongestWord{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){;
            String input = sc.nextLine();
            String[] list = input.split("\\s+");
            String longest = "";
            for(String word : list){
                if (word.length()>longest.length()) longest = word;
            }
            System.out.println("Longest word is: "+longest);
        }
    }
}