import java.util.Scanner;
public class ChocolatesDivision {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int numberOfChocolates = sc.nextInt();
			int numberOfChildren = sc.nextInt();
			System.out.println("Number of chocolates for each child: "+divide(numberOfChocolates,numberOfChildren)[0]+"   Remaining chocolates: "+divide(numberOfChocolates,numberOfChildren)[1]);
		}
    }
    public static int[] divide(int numberOfChocolates, int numberOfChildren) {
        int equalDivision = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{equalDivision,remainingChocolates};
    }
}