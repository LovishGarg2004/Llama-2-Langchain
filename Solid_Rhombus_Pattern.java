import java.util.Scanner;

public class Solid_Rhombus_Pattern {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        
        System.out.print("Enter the no. of rows = ");
        int rows = object.nextInt();
        
        System.out.print("Enter the no. of columns = ");
        int columns = object.nextInt();

        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < columns + rows - (i + 1) ; j++)
            {
                if(j < rows - (i + 1))
                {
                    System.out.print(" ");
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        object.close();
    }
}
