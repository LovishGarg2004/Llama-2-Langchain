import java.util.*;

public class Insertion_Sorting {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int num = object.nextInt();
        
        int array[] = new int[num];

        System.out.println("Enter elements of array :");
        for(int i = 0 ; i < array.length ; i++)
        {
            array[i] = object.nextInt();
        }

        //Insertion Sorting - Sorted and Unsorted parts.
        for(int i = 1 ; i < array.length ; i++)
        {
            int current = array[i];
            int j = i - 1;

            while(j >= 0 && current < array[j])
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

        System.out.println("Sorted Array :");
        for(int i = 0 ; i < array.length ; i++)
        {
            System.err.print(array[i] + "\t");
        }

        object.close();
    }
}
