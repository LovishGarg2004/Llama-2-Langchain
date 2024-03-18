import java.util.Scanner;

public class Half_Pyramid_Pattern {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        System.out.print("Enter number of rows to be printed : ");
        int rows = object.nextInt();

        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        object.close();
    }
    
}
