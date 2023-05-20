package tasks6;

import java.util.Arrays;
import java.util.Scanner;

public class LoginSignup {
    public static void main(String[] args) {



        User user[]=new User[5];
           user[0]= Login("imransahbazov@446gmail.com","Ps@sw0rd");

           user[1]= Login("imransahfdsdsf@46gmail.com", "P@sssdfsdw0rd");

        System.out.println(Arrays.toString(user));


    }
    public static User Login(String email, String password){


        User user = null;
        try {
              user=new User(email,password);
            System.out.println("ugurla login oldunuz");



        } catch (wrongEmailException e) {
            e.printStackTrace();
            System.out.println("email qaydalarina dogru riayet etmemisiz");
        } catch (wrongPasswordException e) {
            e.printStackTrace();
            System.out.println("password qaydalarina dogru riayet etmemisiz");
        }

        return user;
    }
}
