package base;

public class User {
    private String userName = "User"; //private shouldn't be accessed by user
    private String password = "Password1!"; //private shouldn't be accessed by user

    public String enteredUsername;
    public String enteredPassword;

    public void setEnteredUsername(String enteredUsername) {
        this.enteredUsername = enteredUsername;
    }

    public void setEnteredPassword(String enteredPassword) {
        this.enteredPassword = enteredPassword;
    }

    public void verify(User user)
    {
        //verifies password entered by comparing to user and password in system storage
        if(enteredUsername.equals(userName) && enteredPassword.equals(password))
            System.out.println("Welcome!");

        else
            System.out.println("I don't know you.");
    }
}
