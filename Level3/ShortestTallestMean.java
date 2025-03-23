import java.util.Scanner;

public class ShortestTallestMean{
	public static double sum(int[] heights){
		double sum =0;
		for(int i=0; i<heights.length; i++){
			sum += heights[i];
		}return sum;
	}
	public static double meanHeight(int[] heights){
		return sum(heights)/heights.length;
	}
	public static int shortest(int[] heights){
		int small = heights[0];
		for(int i=1; i<heights.length; i++){
			if(heights[i] < small){
				small = heights[i];
			}
		}return small;
	}
	public static int tallest(int[] heights){
		int tall = heights[0];
		for(int i=1; i<heights.length; i++){
			if(heights[i] > tall){
				tall = heights[i];
			}
		}return tall;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] heights = new int[11];
		for(int i =0; i<11 ;i++){
			heights[i] = (int) (Math.random() * 101) + 150;
		}
		double totalSum = sum(heights);
        double mean = meanHeight(heights);
        int smallest = shortest(heights);
        int tallest = tallest(heights);
		System.out.println("Sum : " + totalSum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest : " + smallest);
        System.out.println("Tallest : " + tallest);
		
		scan.close();
	}
	
}