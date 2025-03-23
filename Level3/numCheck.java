import java.util.Scanner;

public class numCheck{
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
    public static int[] reverse(int[] digits) {
        int[] reverse = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i]; 
        }
        return reverse;
    }
	public static boolean check(int[] digits, int[] reverse){
		if(digits.length != reverse.length){
			return true;
		}
		for(int i=0; i< digits.length; i++){
			if(digits[i] != reverse[i]){
				return false;
			}
		}return true;
	}
	public static boolean pallindrome(int[] digits, int[] reverse){
		if(digits.length != reverse.length){
			return true;
		}
		for(int i=0; i< digits.length; i++){
			if(digits[i] != reverse[i]){
				return false;
			}
		}return true;
	}
	public static boolean duck(int[] digits){
		for(int i=1; i<digits.length; i++){
			if(digits[i] == 0){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int count = count(num);
		int[] digitArray = digits(num);
		int[] reverseArray = reverse(digitArray);
		boolean check = check(digitArray, reverseArray);
		boolean pallindrome = pallindrome(digitArray, reverseArray);
		boolean duck = duck(digitArray);
		
		System.out.println("Count: "+count);
		System.out.println("Digits: ");
		for(int i=0; i<digitArray.length; i++){
			System.out.println(digitArray[i] + " ");
		}
		System.out.println("Reverse Digits: ");
		for(int i=0; i<reverseArray.length; i++){
			System.out.println(reverseArray[i] + " ");
		}
		System.out.println("Check 2 array are equal: "+check);
		System.out.println("Pallindrome? "+pallindrome);
		System.out.println("Duck? "+duck);
		scan.close();
	}
	
}