import java.util.Scanner;

public class Print_Transpose_of_Matrix {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the value of rows = ");
        int rows = object.nextInt();
        
        System.out.print("Enter the value of columns = ");
        int columns = object.nextInt();

        int array[][] = new int[rows][columns];

        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < columns ; j++)
            {
                array[i][j] = object.nextInt();
            }
        }

        System.out.println("Transpose of Matrix : ");

        for(int i = 0 ; i < columns ; i++)
        {
            for(int j = 0 ; j < rows ; j++)
            {
                System.out.print(array[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }

        object.close();
    }
}
