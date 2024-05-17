package apps.path;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Example8 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Semicolon Labs\\IdeaProjects\\JavaExerccises\\src\\apps\\path\\sample.txt";
        try(InputStreamReader  inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){
            //String date = bufferedReader.lines().collect(Collectors.joining("\n"));
            System.out.println("Enter your data: ");
            String data = bufferedReader.readLine();
            System.out.println("you entered "+data);
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
