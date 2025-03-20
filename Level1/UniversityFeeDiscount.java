public class UniversityFeeDiscount{
	public static void main(String[] args){
		int fee = 125000;
		int discountPercent = 10;
		int discount = fee / discountPercent;
		int discountedFee = fee - discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFee);
	}
}