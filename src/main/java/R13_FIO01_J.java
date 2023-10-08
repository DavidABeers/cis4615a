import java.io.File;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

// compliant, uses java.nio classes to manage file permissions
public class R13_FIO01_J {
    public static void main(String []args){
        WPath file = new File("file").toPath();

// Throw exception rather than overwrite existing file
        Set<OpenOption> options = new HashSet<OpenOption>();
        options.add(StandardOpenOption.CREATE_NEW);
        options.add(StandardOpenOption.APPEND);

// File permissions should be such that only user may read/write file
        Set<PosixFilePermission> perms =
                PosixFilePermissions.fromString("rw-------");
        FileAttribute<Set<PosixFilePermission>> attr =
                PosixFilePermissions.asFileAttribute(perms);

        try (SeekableByteChannel sbc =
                     Files.newByteChannel(file, options, attr)) {
            // Write data
        };
    }
}
