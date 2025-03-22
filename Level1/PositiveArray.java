import java.util.Scanner;
public class PositiveArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		int i=0;
		double number;
		double[] numberArray = new double [10];
		while(true){
			number = sc.nextInt();
			if(number<=0) break;
			numberArray[i] = number;
			i++;
			if(i>=numberArray.length) break;
		}
		for(int j=0;j<i;j++){
			total+=numberArray[j];
		}
		System.out.println("The total is "+total);
		sc.close();
	}
}