import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    // masks the upper 32 bits of a long
    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
}
