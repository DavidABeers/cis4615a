import java.io.File;

public class R02_XP00_J {

    // noncompliant, does not check for operation success
    public void deleteFile(){
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();
    }

    
}
