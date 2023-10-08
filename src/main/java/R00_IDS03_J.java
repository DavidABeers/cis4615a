import java.util.logging.Logger;

public class R00_IDS03_J {

    // takes unauthorized user input without data sanitization
    public void noncomplaintExample(String username, boolean loginSuccessful){

        if(loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        }
        else {
            logger.severe("User login failed for: " + username);
        }
    }

}
