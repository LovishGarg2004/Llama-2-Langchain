import java.util.Scanner;

public class Display_Username_from_an_Email {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.println("Enter a String :");
        String Word = object.next();

        int end_index = 0;

        for (int i = 0; i < Word.length(); i++) {
            if (Word.charAt(i) == '@') {
                end_index = i;
                break;
            }
        }

        String Usernname = Word.substring(0, end_index);
        System.out.println("Username : " + Usernname);

        object.close();
    }
}
