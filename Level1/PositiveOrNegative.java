import java.util.Scanner;
public class PositiveOrNegative{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String check = ((n>0)?"positive":(n<0)?"negative":"zero");
	}
}