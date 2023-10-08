import java.io.File;

public class R02_XP00_J {

    // checks for operation success and does something in response to failure
    public void deleteFile(){
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
            // Handle failure to delete the file
        }
    }

}
