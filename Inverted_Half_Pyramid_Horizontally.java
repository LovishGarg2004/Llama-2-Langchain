import java.util.Scanner;

public class Inverted_Half_Pyramid_Horizontally {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        System.out.print("Enter number rows = ");
        int rows = object.nextInt();

        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < rows ; j++)
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