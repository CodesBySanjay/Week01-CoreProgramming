import java.util.Scanner;
public class numChecker{
	public static int count(int number){
		int count = 0;
		while(number >0){
			number /= 10;
			count += 1;
		}
		return count;
	}
	public static int[] digits(int number) {
        int length = count(number);
        int[] digits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
	public static boolean prime(int number){
		if(number < 2){
			return false;
		}
		for(int i=2; i* i< number;i++){
			if(number % i ==0){
				return false;
			}
		} 
		return true;	
	}
	
	public static boolean neon(int number, int[] digits) {
        int square = 0;
		for(int i=0; i<digits.length; i++){
			square += Math.pow(digits[i],2);
		}
		return square == number;
    }
    public static boolean spy(int[] digits) {
        int sum = 0;
		for(int i=0; i<digits.length; i++){
			sum += digits[i];
		}
		int product = 1;
		for(int i=0; i<digits.length; i++){
			product *= digits[i];
		}
		return sum == product;
    }
	public static boolean automorphic(int number){
		int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
	}
	public static boolean buzz(int number){
		if((number % 7==0) || (String.valueOf(number).endsWith("7"))){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int count = count(num);
		int[] digitArray = digits(num);
		boolean prime = prime(num);
		boolean neon = neon(num, digitArray);
		boolean spy = spy(digitArray);
		boolean automorphic = automorphic(num);
		boolean buzz = buzz(num);
		
	
		System.out.println("Prime? "+prime);
		System.out.println("Neon? "+neon);
		System.out.println("Spy? "+spy);
		System.out.println("Automorphic? "+automorphic);
		System.out.println("Buzz? "+buzz);
		scan.close();
	}
	
}