import java.util.Scanner;

public class Print_Matrix_in_Spiral_Order {
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

        int row_start = 0;
        int row_end = rows - 1;
        int column_start = 0;
        int column_end = columns - 1;

        System.out.println("The Spiral order of the Matrix : ");

        while(row_start <= row_end && column_start <= column_end)
        {
            for(int i = column_start ; i <= column_end ; i++)    // This is for row no. =  row_start 
            {
                System.out.print(array[row_start][i]);
                System.out.print(" ");
            }
            row_start++;
            System.out.println();

            for(int i = row_start ; i <= row_end ; i++)    // This is for column no. =  column_end 
            {
                System.out.print(array[i][column_end]);
                System.out.print(" ");
            }
            column_end--;
            System.out.println();
            
            for(int i = column_end ; i >= column_start ; i--)    // This is for row no. =  row_end 
            {
                System.out.print(array[row_end][i]);
                System.out.print(" ");
            }
            row_end--;
            System.out.println();
            
            for(int i = row_end ; i >= row_start ; i--)    // This is for column no. =  column_start 
            {
                System.out.print(array[i][column_start]);
                System.out.print(" ");
            }
            column_start++;
            System.out.println();
            
            
        }
        
        object.close();
    }
}
