import java.util.Scanner;

public class numberCheck{
	public static int count(int number){
		int count = 0;
		while(number >0){
			number /= 10;
			count += 1;
		}
		return count;
	}
	public static int[] digits(int number){
		int length = count(number);
		int[] digits = new int[length];
		for(int i=0; i<length; i++){
			digits[i] = number % 10;
			number /= 10 ;
		}
		return digits;
	}
	public static int sum(int[] digits){
		int sum = 0;
		for(int i=0; i<digits.length; i++){
			sum += digits[i];
		}
		return sum;
	}
	public static int squareSum(int[] digits){
		int square = 0;
		for(int i=0; i<digits.length; i++){
			square += Math.pow(digits[i],2);
		}
		return square;
	}
	public static boolean harshadNumber (int number){
		int digitSum = sum(digits(number));
		return number % digitSum == 0;
	}
	public static int[][] frequency(int[] digits){
		int[] countArray = new int[10];
		for (int i = 0; i < digits.length; i++) {
			countArray[digits[i]]++;
		}
		int[][] table = new int[10][2];
		for(int i =0; i<10; i++){
			table[i][0] = i;
			table[i][1] = countArray[i];
		}
		return table;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int count = count(num);
		int[] digitArray = digits(num);
		int sum = sum(digitArray);
		int squareSum = squareSum(digitArray);
		boolean harshadNumber = harshadNumber(num);
		int[][] frequency = frequency(digitArray);
		
		System.out.println("Count: "+count);
		System.out.println("Digits: ");
		for(int i=0; i<digitArray.length; i++){
			System.out.println(digitArray[i] + " ");
		}
		System.out.println("Sum: "+sum);
		System.out.println("Square sum: "+squareSum);
		System.out.println("Is harshad number: "+harshadNumber);
		System.out.println("Frequency: ");
		for(int i=0; i<10; i++){
			if(frequency[i][1] >0){
				System.out.println("Digit: "+frequency[i][0] +"; frequency: "+frequency[i][1]);
			}
		}
		scan.close();
	}
	
}