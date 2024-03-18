import java.util.Scanner;

public class Check_whether_array_sorted_in_ascending_order {
     public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }

      boolean is_ascending = true;

      for(int i = 0 ; i < numbers.length - 1 ; i++)
      {
        if(numbers[i] > numbers[i + 1])
        {
            is_ascending = false;
            break;
        }
      }

      if(is_ascending == true) {
        System.out.println("The array is sorted in ascending order");
    } else {
        System.out.println("The array is not sorted in ascending order");
    }

    sc.close();

    }

}
