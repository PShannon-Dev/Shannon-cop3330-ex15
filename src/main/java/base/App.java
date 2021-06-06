package base;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //instance variables
        App myApp = new App();
        User user1 = new User();

        //Prompt for username and password
        myApp.input(user1);

        //verify
        user1.verify(user1);
    }
    public void input(User user)
    {
        //username
        System.out.print("What is the username? ");
        user.setEnteredUsername(in.next());

        //password
        System.out.print("What is the password? ");
        user.setEnteredPassword(in.next());

    }
}
