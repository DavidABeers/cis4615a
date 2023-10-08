import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class R07_ERR01_J {

    // noncompliant, doesn't prevent exceptions from being visible to the user
    public static void main(String[] args) throws FileNotFoundException {
        // Linux stores a user's home directory path in
        // the environment variable $HOME, Windows in %APPDATA%
        FileInputStream fis =
                new FileInputStream(System.getenv("APPDATA") + args[0]);
    }
}
