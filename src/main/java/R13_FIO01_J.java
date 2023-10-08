import java.io.FileWriter;
import java.io.Writer;

// noncompliant, access permissions are implementation-defined
public class R13_FIO01_J {
    public static void main(String []args){
        Writer out = new FileWriter("file");
    }
}
