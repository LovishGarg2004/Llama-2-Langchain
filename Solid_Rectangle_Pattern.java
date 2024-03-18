import java.util.Scanner;

public class Solid_Rectangle_Pattern {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        
        System.out.print("Enter no. of rows : ");
        int rows = object.nextInt();
        
        System.out.print("Enter no. of columns : ");
        int columns = object.nextInt();
        
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < columns ; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }


        object.close();
    }
    
}
