// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 

// If they enter 0 then stop.

// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”

// 	Because marks don’t matter but our effort does.

import java.util.Scanner;

public class Menu_Driven_Marks_Program {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);

        int number;
        int marks;

        do
        {
            System.out.println("Enter the marks of the student :");
            marks = object.nextInt();

            if(marks >= 90)
            {
                System.out.println("This is Good");
            }
            else if(marks >= 60 && marks <= 89)
            {
                System.out.println("This is also Good");
            }
            else if(marks >= 0 && marks <= 59)
            {
                System.out.println("This is also Good");
            }
            else
            {
                System.out.println("Invalid Entry !!!");
            }

            System.out.println("Want to continue or not ?");
            System.out.println("Press 1(yes) and 0(no) :");
            number = object.nextInt();
        }
        while(number == 1);

        System.out.println("Thank You !!!");
        object.close();
    }
}
