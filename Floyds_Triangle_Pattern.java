import java.util.Scanner;

public class Floyds_Triangle_Pattern {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        System.out.print("Enter no. of rows = ");
        int rows = object.nextInt();
        int number = 1;

        for (int i = 0 ; i < rows ; i++)
        {
            for (int j = 0 ; j <= i ; j++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        object.close();
    }
}
