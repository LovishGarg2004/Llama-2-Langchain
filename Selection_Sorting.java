import java.util.*;

public class Selection_Sorting {
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

        // Selection Sorting 
        for(int i = 0 ; i < array.length - 1 ; i++)
        {
            int current = i;
            for(int j = i ; j < array.length ; j++)
            {
                if(array[current] > array[j])
                {
                    current = j;
                }
            }
            // Swapping
            int temp = array[current];
            array[current] = array[i];
            array[i] = temp;
        }

        System.out.println("Sorted Array :");
        for(int i = 0 ; i < array.length ; i++)
        {
            System.err.print(array[i] + "\t");
        }

        object.close();

    }
}
