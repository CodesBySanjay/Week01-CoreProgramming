public class Bonus{
	public static int[][] generateEmployeeData(int employeesCount)
	{
		int employeeData[][]=new int[employeesCount][2];
		for(int i=0;i<employeesCount;i++)
		{
			employeeData[i][0]=10000+(int)(Math.random()*90000);
			employeeData[i][1]=(int)(Math.random()*11);
		}
		return employeeData;
	}
	public static double[][] calculateBonus(int employeeData[][])
	{
		double newSalary[][]=new double[employeeData.length][2];
		for(int i=0;i<employeeData.length;i++)
		{
			if(employeeData[i][1]>5)
				newSalary[i][1]=employeeData[i][0]*0.05;
			else
				newSalary[i][1]=employeeData[i][0]*0.02;
			newSalary[i][0]=newSalary[i][1]+employeeData[i][0];
		}
		return newSalary;
	}
	public static void displayEmployeeData(int employeeData[][],double newSalaries[][])
	{
		double totalOldSalary=0,totalNewSalary=0,totalBonus=0;
		System.out.println("\n--------------------------------------------------------------");
		System.out.printf("%-5s %-10s %-15s %-15s %-15s","ID","Salary","Years of Service","Bonus Amount","New Salary");
		System.out.println("\n--------------------------------------------------------------");
		for(int i=0;i<employeeData.length;i++)
		{
			totalOldSalary+=employeeData[i][0];
			totalNewSalary+=newSalaries[i][0];
			totalBonus+=newSalaries[i][1];
			System.out.printf("%-5d %-10d %-15d %-15.2f %-15.2f\n",(i+1),employeeData[i][0],employeeData[i][1],newSalaries[i][1],newSalaries[i][0]);
        }

        System.out.println("\n----------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-15s %-15.2f %-15.2f","Total",totalOldSalary,"",totalBonus,totalNewSalary);
        System.out.println("\n----------------------------------------------------------------");
    }
		public static void main(String[] args)
	{
		int NoOfEmployees=10;
		int [][] employeeData=generateEmployeeData(NoOfEmployees);
		double [][] newSalaries=calculateBonus(employeeData);
		displayEmployeeData(employeeData,newSalaries);
	}
}