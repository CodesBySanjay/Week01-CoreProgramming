import java.util.Scanner;
public class GradingSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Physics marks: ");
		int physics = sc.nextInt();
		System.out.print("Chemistry marks: ");
		int chemistry = sc.nextInt();
		System.out.print("Maths marks: ");
		int maths = sc.nextInt();
		int average = (physics+chemistry+maths)/3;
		if(average>=80){
			System.out.println("Average Marks: ", average);
			System.out.print("Grade: ", 'A');
			System.out.print("Remarks: Level 4, above agency-normalized standards");
		}
		else if(average>=70 && average<80){
			System.out.println("Average Marks: ", average);
			System.out.print("Grade: ", 'B');
			System.out.print("Remarks: Level 3, at agency-normalized standards");
		}
		if(average>=60 && average<70){
			System.out.println("Average Marks: ", average);
			System.out.print("Grade: ", 'C');
			System.out.print("Remarks: Level 2, below, but approaching agency-normalized standards");
		}
		if(average>=50 && average<60){
			System.out.println("Average Marks: ", average);
			System.out.print("Grade: ", 'D');
			System.out.print("Remarks: Level 1, well below agency-normalized standards");
		}
		if(average>=40 && average<50){
			System.out.println("Average Marks: ", average);
			System.out.print("Grade: ", 'E');
			System.out.print("Remarks: Level 1-, too below agency-normalized standards");
		}
		if(average<=39){
			System.out.println("Average Marks: ", average);
			System.out.print("Grade: ", 'R');
			System.out.print("Remarks: Remedial standards");
		}
	}
}