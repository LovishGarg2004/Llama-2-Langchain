import java.util.Scanner;

public class Inverted_Half_Pyramid_with_Numbers {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        System.out.print("Enter no. of rows = ");
        int rows = object.nextInt();

        for (int i = 0 ; i < rows ; i++)
        {
            for (int j = 1 ; j <= rows - i ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        object.close();
    }
}