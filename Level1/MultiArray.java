import java.util.Scanner;
public class MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter the value at "+i+","+j+": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}