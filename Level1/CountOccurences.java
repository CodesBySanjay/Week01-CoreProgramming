import java.util.Scanner;
class CountOccurences{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in);){
            String main = sc.nextLine();
            String sub = sc.nextLine();
            int index=0; int count=0;
            while((index=main.indexOf(sub, index))!=-1){
                count++;
                index+=sub.length();
            }
            System.out.println("Occurences = "+count);
        }
    }
}