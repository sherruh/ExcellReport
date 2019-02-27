package interfaces;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public interface ICopyFile {
    default void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }
}
