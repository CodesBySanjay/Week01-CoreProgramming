public class ProfitLoss{
	public static void main(String[] args){
		int cp = 129;
		int sp = 191;
		int profit = sp-cp;
		float profit_percent = (float) profit / cp * 100;
		System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profit_percent);
	}
}