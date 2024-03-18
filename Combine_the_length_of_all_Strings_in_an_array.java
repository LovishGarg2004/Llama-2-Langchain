import java.util.Scanner;

public class Combine_the_length_of_all_Strings_in_an_array {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the size of the array of Strings :");
        int size = object.nextInt();

        String array[] = new String[size];
        System.out.println("Enter " + size + " Strings :");

        int total_length = 0;
        
        for(int i = 0 ; i < size ; i++)
        {
            array[i] = object.next();
            total_length += array[i].length();
        }

        System.out.println("Toatal length of all the Strings in the array is : " + total_length);

        object.close();
    }
}