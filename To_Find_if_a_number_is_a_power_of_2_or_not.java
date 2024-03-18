import java.util.*;

public class To_Find_if_a_number_is_a_power_of_2_or_not {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in); 
        System.out.println("Enter the number to be checked = ");
        int number = object.nextInt();

        int count = 0;
        int bitmask = 1 << count;
        
        if((bitmask & number) != 0)
        {
            System.out.println("number " + number + " is not the power of 2");
        }
        else
        {
            count = 1;
            int no_of_bit1 = 0;
            int temp = number;

            while(no_of_bit1 <= 1 && temp > 1)
            {
                bitmask = 1 << count;
                if((bitmask & number) != 0)
                {
                    no_of_bit1++;
                }
                count++;
                temp = temp / 2;
            }

            if(no_of_bit1 > 1)
            {
                System.out.println("number " + number + " is not the power of 2");
            }
            else
            {
                System.out.println("number " + number + " is the power of 2");
            }
        }
        object.close();
    }
}