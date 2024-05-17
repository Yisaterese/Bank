package apps.path;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Example10 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Semicolon Labs\\IdeaProjects\\JavaExerccises\\src\\apps\\path\\sample.txt";
        Path path = Paths.get(fileLocation);
        try{
            BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
            bufferedWriter.write("Hello mr Bean");
            bufferedWriter.close();
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
       }
    }

}
