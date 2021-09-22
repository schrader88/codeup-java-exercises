package FileIOLecture;

import java.io.IOException;
import java.nio.file.*;

public class FileIOLecture {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//        Path pathToThisLecture = Paths.get("FileIOLecture", "FileIOLecture.java");
//        System.out.println(pathToThisLecture);
        Path pathToOurDataDir = Paths.get("src/data");
//        System.out.println(pathToOurDataDir);
        try {
            Files.createDirectories(pathToOurDataDir);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
