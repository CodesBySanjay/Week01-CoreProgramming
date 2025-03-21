import java.util.Scanner;
public class OddOrEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>0){
			for(int i=1;i<=n;i++){
				System.out.print(i);
				if(i%2==0){
					System.out.println(" is even");
				}
				else{
					System.out.println(" is odd");
				}
			}
		}
		else{
			System.out.println("Not a natural number");
		}	
	}
}