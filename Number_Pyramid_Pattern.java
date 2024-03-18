import java.util.Scanner;

public class Number_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("Enter the value of number : ");
        int number = object.nextInt();
        

        for(int i = 1 ; i <= number ; i++)
        {
            int space = 0;

            for(int j = 1 ; j <= 2*number - 1 ; j++)
            {
                if(j <= number - i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(i + " ");
                    space++;

                    if(space == i)
                    {
                        break;
                    }
                }
            }
            
            System.out.println();
        }
        object.close();
    }
}
