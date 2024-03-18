import java.util.Scanner;

public class Exchaninging_letter_e_with_i_in_a_string {
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        
        String Word = object.next();
        String new_Word = "";

        for(int i = 0 ; i < Word.length() ; i++)
        {
            if(Word.charAt(i) == 'e')
            {
                new_Word += 'i';
            }
            new_Word += Word.charAt(i);
        }

        System.out.println("The new Word is : " + new_Word);

        object.close();
    }
}
