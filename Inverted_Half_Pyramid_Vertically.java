import java.util.Scanner;

public class Inverted_Half_Pyramid_Vertically {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        System.out.print("Enter number rows = ");
        int rows = object.nextInt();

        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = rows - (i + 1) ; j >= 0 ; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        object.close();
    }
}
