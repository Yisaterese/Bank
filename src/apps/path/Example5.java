package apps.path;

import java.io.FileReader;
import java.io.IOException;

public class Example5 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Semicolon Labs\\IdeaProjects\\JavaExerccises\\src\\apps\\path\\sample.txt";
        char[] fileChars = new char[1024];
        try(FileReader fileReader = new FileReader(fileLocation)){
            int numberOfCharactersRead = fileReader.read(fileChars);
            displayFileContent(numberOfCharactersRead, fileChars);
        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void displayFileContent(int numberOfCharactersRead, char[] fileChars) {
        for(int counter = 0; counter < numberOfCharactersRead; counter++){
            System.out.println(fileChars[counter]);
        }
    }
}
