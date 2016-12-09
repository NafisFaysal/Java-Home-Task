package nafishometask;
import java.util.Scanner;
/**
 * Created by nafis on 09/10/16.
 */
public class LabTask2 {
    public static void main(String[] args) {
        String passValue;

        Scanner password = new Scanner(System.in);
        System.out.println("Enter String(password):  ");
        passValue = password.nextLine();
        if (password(passValue)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }


    public static boolean password(String password) {

        if (password.length() < 8) {
            return false;
        } else {
            char c;
            int count = 0;
            for (int i = 0; i < password.length() ; i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;

                }
            }
            if (count < 2)   {
                return false;
            }
        }
        return true;
    }
}
