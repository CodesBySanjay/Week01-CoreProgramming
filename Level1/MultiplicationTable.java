import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] multiplicationTable = new int [10];
		for (int i=0;i<10;i++){
			multiplicationTable[i] = number * (i+1);
		}
		for(int i = 0; i<10;i++){
			System.out.println(number+" * "+(i+1)+" = "+multiplicationTable[i]);
		}
		sc.close();
	}
}