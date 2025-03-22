import java.util.Scanner;
public class GradeCheck2D{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number of persons:");
		int n=scanner.nextInt();
		scanner.nextLine();
		double marks[][]=new double[n][3];
		double percent[]=new double[n];
		char grade[]=new char[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks of student "+(i+1)+":");
			System.out.print("Enter the physics marks:");
			marks[i][0]=scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Enter the chemistry marks:");
			marks[i][1]=scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Enter the maths marks:");
			marks[i][2]=scanner.nextDouble();
			scanner.nextLine();
		}
		scanner.close();
		for(int i=0;i<n;i++)
		{
			percent[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
			if(percent[i]>=80)
				grade[i]='A';
			else if(percent[i]>=70)
				grade[i]='B';
			else if(percent[i]>=60)
				grade[i]='C';
			else if(percent[i]>=50)
				grade[i]='D';
			else if(percent[i]>=40)
				grade[i]='E';
			else
				grade[i]='R';
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\nMark details of student "+(i+1));
			System.out.println("Physics   :"+marks[i][0]);
			System.out.println("Chemistry :"+marks[i][1]);
			System.out.println("Maths     :"+marks[i][2]);
			System.out.println("Percentage:"+percent[i]+"%");
			System.out.println("Grade     :"+grade[i]);
		}
	}
}