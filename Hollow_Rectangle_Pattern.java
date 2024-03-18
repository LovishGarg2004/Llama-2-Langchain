import java.util.Scanner;

public class Hollow_Rectangle_Pattern {
    
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.print("Enter number of rows :");
        int rows = object.nextInt();

        System.out.print("Enter number of columns :");
        int columns = object.nextInt();   
        
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < columns ; j++)
            {
                if(i == 0 || i == rows -1 || j == 0 || j == columns - 1)
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        object.close();
    }
}
