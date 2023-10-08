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

    // sanitizes the user input to prevent injection attacks
    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username))
      ? username : "unauthorized user";
    }
    public void compliantExample(String username, boolean loginSuccessful){
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

}
