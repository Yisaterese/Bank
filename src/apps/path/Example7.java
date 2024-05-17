package apps.path;

import java.io.*;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Semicolon Labs\\IdeaProjects\\JavaExerccises\\src\\apps\\path\\sample.txt";
        try(FileInputStream  fileInputStream = new FileInputStream(fileLocation)){
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String date = bufferedReader.lines().collect(Collectors.joining("\n"));
            System.out.println(date);
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
