import java.util.Scanner;
public class MaximumHandshakes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("The number of maximum possible handshakes is "+maxHandshakes);
	}
}