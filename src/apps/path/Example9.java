package apps.path;

import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Example9 {
    public static void main(String[] args) {
       // String fileLocation = "C:\\Users\\Semicolon Labs\\IdeaProjects\\JavaExerccises\\src\\apps\\path\\sample.txt";
        try(OutputStreamWriter writer = new OutputStreamWriter(out);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            bufferedWriter.write("Hello world");
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
