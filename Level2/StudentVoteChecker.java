import java.util.Scanner;
public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if(age<0) return false;
        else return age>=18;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] ages = new int[10];
            for(int i=0;i<10;i++){
                ages[i] = sc.nextInt();
            }
            for(int i : ages){
                System.out.println(canStudentVote(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}