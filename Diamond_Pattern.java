import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = object.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print(" ");
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            
            for(int j = i ; j > 1 ; j--)
            {
                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int i = n ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print(" ");
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            
            for(int j = i ; j > 1 ; j--)
            {
                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();
        }

        object.close();
    }
}
