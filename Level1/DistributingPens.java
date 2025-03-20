public class DistributingPens{
	public static void main(String[] args){
		int pens = 14;
		int students = 3;
		int remaining = pens % students;
		int quantity = (pens-remaining)/students;
		System.out.println("The Pen Per Student is "+quantity+" and the remaining pen not distributed is "+remaining);
	}
}