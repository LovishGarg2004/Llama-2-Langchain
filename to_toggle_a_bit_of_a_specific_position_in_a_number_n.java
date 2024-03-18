import java.util.*;

public class to_toggle_a_bit_of_a_specific_position_in_a_number_n {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in); 
        System.out.println("Enter the number = ");
        int number = object.nextInt();

        System.out.println("Enter the position to toggle = ");
        int position = object.nextInt();

        int bitmask = 1<<position;
        int new_number;

        if((bitmask & number) != 0)
        {
            int new_bitmask = ~(bitmask);
            new_number = new_bitmask & number;
        }
        else
        {
            new_number = bitmask | number;
        }

        System.out.println("After Toggling : New Number = " + new_number);
        object.close();
        
    }
}
