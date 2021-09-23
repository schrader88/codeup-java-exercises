package FileIOLecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FileIOLectureTest {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//        Path pathToThisLecture = Paths.get("FileIOLecture", "FileIOLecture.java");
//        System.out.println(pathToThisLecture);
        Path pathToOurDataDir = Paths.get("src/data");
//        System.out.println(pathToOurDataDir);
//        try {
//            Files.createDirectories(pathToOurDataDir);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        Path pathToOurFile = Paths.get("src/data", "list.txt");

//        try {
//            if (Files.notExists(pathToOurFile)) {
//                Files.createFile(pathToOurFile);
//            } else {
//                System.out.println("The " + pathToOurFile + " file already exists!");
//            }
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        List<String> imperials = Arrays.asList("Augustus", "Livia", "Agrippina", "Claudius");

//        try {
//            Files.write(pathToOurFile, imperials);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

//        List<String> currentList = new ArrayList<>();
//
//        try {
//            currentList = Files.readAllLines(pathToOurFile);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
//        for (String item : currentList) {
//            System.out.println(item);
//        }
        FileIOLecture fiol = new FileIOLecture();

//        fiol.readFileAndOutput(pathToOurFile);

//        try {
//            Files.writeString(pathToOurFile, "Messalina\n", StandardOpenOption.APPEND);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

//        fiol.readFileAndOutput(pathToOurFile);

        List<String> lateImperials = new ArrayList<>();

        lateImperials.add("Galla Placidia");
        lateImperials.add("Theodora");
        lateImperials.add("Licinia Eudoxia");

//        try {
//            Files.write(pathToOurFile, lateImperials, StandardOpenOption.APPEND);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

//        fiol.readFileAndOutput(pathToOurFile);

        List<String> currentList = new ArrayList<>();

//        try {
//            currentList = Files.readAllLines(pathToOurFile);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        Iterator<String> listIterator = currentList.iterator();

//        while (listIterator.hasNext()) {
//            String item = listIterator.next();
//            if (item.equalsIgnoreCase("Claudius")) {
//                listIterator.remove();
//            }
//        }
//
//        try {
//            Files.write(pathToOurFile, currentList);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        fiol.readFileAndOutput(pathToOurFile);
    }
}
