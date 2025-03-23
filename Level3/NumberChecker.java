import java.util.Scanner;

public class NumberChecker{
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
	public static boolean duck(int[] digits){
		for(int i=1; i<digits.length; i++){
			if(digits[i] == 0){
				return true;
			}
		}
		return false;
	}
	public static boolean armstrong(int number){
		int[] digits = digits(number);
		int armstrong =0;
		for(int i=0; i<digits.length; i++){
			armstrong += Math.pow(digits[i],3);
		}
		return armstrong == number;
	}
	public static void largestSecondLargest(int[] digits){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0; i<digits.length; i++){
			if(digits[i] > largest){
				secondLargest = largest;
				largest = digits[i];
			}
		}
		System.out.println("Largest: "+largest);
		System.out.println("Second largest: "+secondLargest);
	}
	public static void smallestSecondSmallest(int[] digits){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=0; i<digits.length; i++){
			if(digits[i] < smallest){
				secondSmallest = smallest;
				smallest = digits[i];
			}
		}
		System.out.println("Smallest: "+smallest);
		System.out.println("Second Smallest: "+secondSmallest);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int count = count(num);
		int[] digitArray = digits(num);
		boolean duck = duck(digitArray);
		boolean armstrong = armstrong(num);
		System.out.println("Count: "+count);
		System.out.println("Digits: ");
		for(int i=0; i<digitArray.length; i++){
			System.out.println(digitArray[i] + " ");
		}
		System.out.println("Is duck: "+duck);
		System.out.println("Is armstrong: "+armstrong);
		largestSecondLargest(digitArray);
		smallestSecondSmallest(digitArray);
		scan.close();
	}
	
}