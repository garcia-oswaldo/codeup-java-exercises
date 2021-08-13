package file_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class IOPractice {
//    public static void main(String[] args) throws IOException {
//        String directory = "js";       //declares directory as data
//        String filename = "madeByJava.js";
//
//        // when writing multiline content you will use a collection to hold each line.
//        ArrayList<String> fileCntents = new ArrayList<String>();
//
//        // each string that we add to the fileContents Collection will represent
//        // a line to write on a file
//        fileCntents.add("const message = \"helloworld\" ");
//        fileCntents.add("//written by jave file system!");
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
////      checks if a directory exists
//        if (Files.notExists(dataDirectory)) {
//            //if directory does not exist , we will create it.
//            Files.createDirectories(dataDirectory);
//        }
//        // checking to see if file exists
//        if (! Files.exists(dataFile)) {
//            // if file does not exist we will create it
//            Files.createFile(dataFile);
//        }
//        // this will write contents to file.
////        Files.write(dataFile,fileCntents);
//
//        //This is how you read a file contents
//        // this is how you will read a file contents and store it in a collection.
//       List<String> contentsReadFromFile = Files.readAllLines(dataFile);
//        System.out.println(contentsReadFromFile);
//       }
public static void main(String[] args) throws IOException {
    String directory = "src/file_io";       //declares directory as data
    String filename = "hello.sh";

    // when writing multiline content you will use a collection to hold each line.
    ArrayList<String> fileCntents = new ArrayList<String>();

    // each string that we add to the fileContents Collection will represent
    // a line to write on a file
    fileCntents.add("say your going to have too much fun with to say command");


    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);
//      checks if a directory exists
    if (Files.notExists(dataDirectory)) {
        //if directory does not exist , we will create it.
        Files.createDirectories(dataDirectory);
    }
    // checking to see if file exists
    if (! Files.exists(dataFile)) {
        // if file does not exist we will create it
        Files.createFile(dataFile);
    }
    // this will write contents to file.
        Files.write(dataFile,fileCntents, StandardOpenOption.APPEND); // to append

    //This is how you read a file contents
    // this is how you will read a file contents and store it in a collection.
    List<String> contentsReadFromFile = Files.readAllLines(dataFile);

    for(String line : contentsReadFromFile)
    System.out.println(line);
}
}
