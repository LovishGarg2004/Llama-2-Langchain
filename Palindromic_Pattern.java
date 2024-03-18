import java.util.Scanner;

public class Palindromic_Pattern {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        System.out.println("Enter the value of n :");
        int n = object.nextInt();

        for(int i = 1 ; i <=n ; i++)
        {
            int flag = 1;
            int number = i; 

            for(int j = 1 ; j < 2*n ; j++)
            {
                if(j <= n - i)
                {
                    System.out.print(" ");
                    System.out.print(" ");
                }
                else if(flag <= i)
                {
                    System.out.print(number);
                    System.out.print(" ");
                    number--;
                    flag++;

                    if(number == 0)
                    {
                        number = number + 2;
                    }
                }
                else if(number <= i)
                {
                    System.out.print(number);
                    System.out.print(" ");
                    number++;
                    flag++;
                }
            }

            System.out.println();
        }

        object.close();
    }
}