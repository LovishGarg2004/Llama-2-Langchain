import java.util.Scanner;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = object.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= 2*n ; j++)
            {
                if(j <= i || j >= 2*n - (i - 1))
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n ; i >= 1 ; i--)
        {
            for(int j = 2*n ; j >= 1 ; j--)
            {
                if(j <= i || j >= 2*n - (i - 1))
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        object.close();
    }
}
