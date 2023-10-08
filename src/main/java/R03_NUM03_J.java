import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    // noncompliant, assumes the data is always signed (doesn't java lack unsigned numerical types?)
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }
}
