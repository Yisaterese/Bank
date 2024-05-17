package apps.path.jason;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Transaction {

    public static void calculateAmountInJsonFile(String pathVariable){
        Path path = Paths.get(pathVariable);
        //BufferedReader bufferedReader = new BufferedReader();
    }
    public static int calculateNumberOfDigitsInATextFile(String filePath) throws IOException {
        int numbersOfDigits = 0;
        Path path = Paths.get(filePath);
        String stringText = Files.readString(path);

        for (int i = 0; true; i++) {
            if (String.valueOf(stringText.charAt(i)).matches("\\d")) {
                 numbersOfDigits++;
            }
        }
        return numbersOfDigits++;
    }


    public static void main(String[] args) {
        calculateAmountInJsonFile("C:\\Users\\Semicolon Labs\\IdeaProjects\\JavaExerccises\\src\\apps\\path\\jason\\textFile");

    }
}
