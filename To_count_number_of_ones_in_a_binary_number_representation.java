import java.util.*;

public class To_count_number_of_ones_in_a_binary_number_representation {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in); 
        System.out.println("Enter the number to be checked = ");
        int number = object.nextInt();

            int count = 0;
            int no_of_bit1 = 0;
            int temp = number;

            while(temp > 0)
            {
                int bitmask = 1 << count;
                if((bitmask & number) != 0)
                {
                    no_of_bit1++;
                }
                count++;
                temp = temp / 2;
            }

            System.out.println("Number of One's in the Binary Representation of the number " + number + " = " + no_of_bit1);

            object.close();
    }
}
