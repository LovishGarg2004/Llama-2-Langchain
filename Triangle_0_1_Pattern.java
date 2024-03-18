import java.util.Scanner;

public class Triangle_0_1_Pattern {
    public static void main(String[] args) {

        System.out.print("Enter the number of rows to be printed : ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for(int i = 1 ; i <= number ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                if((i + j) % 2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        input.close();
    }

}
