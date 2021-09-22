package FileIOLecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOMiniExercise {
    public static void main(String[] args) {
        Path pathToTestDirectory = Paths.get("src/test");

        try {
            Files.createDirectories(pathToTestDirectory);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
