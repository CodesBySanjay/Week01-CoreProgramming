import java.util.Scanner;
public class VoteCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] studentAge = new int [10];
		for (int i=0;i<studentAge.length;i++){
			studentAge[i] = sc.nextInt();
		}
		for (int i=0;i<studentAge.length;i++){
			if (studentAge[i]<0){
				System.out.println("Invalid age");
			}
			else if (studentAge[i]>=18){
				System.out.println("The student with the age "+studentAge[i]+" can vote");
			}
			else{
				System.out.println("The student with the age "+studentAge[i]+" cannot vote");
			}
		}
	}
}