import java.util.*;

public class Bubble_Sorting {
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
        // bubble sorting
        for(int i = 0 ; i < array.length - 1 ; i++)
        {
            for(int j = 0 ; j < array.length - i - 1 ; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array :");
        for(int i = 0 ; i < array.length ; i++)
        {
            System.err.print(array[i] + "\t");
        }

        object.close();
    }
}