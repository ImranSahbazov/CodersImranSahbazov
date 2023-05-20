package tasks6;

import java.util.Arrays;
import java.util.Scanner;

public class LoginSignup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        User[] users = new User[3];
        try {
            users[0] = new User("imransahbazov@446gmail.com", "Ps@sw0rd");

            users[1] = new User("imransahfdsdsf@46gmail.com", "P@sssdfsdw0rd");

        } catch (wrongEmailException e) {
            e.printStackTrace();
            System.out.println("email qaydalarina dogru riayet etmemisiz");
        } catch (wrongPasswordException e) {
            e.printStackTrace();
            System.out.println("password qaydalarina dogru riayet etmemisiz");
        }


        System.out.println(Arrays.toString(users));

    }
}
