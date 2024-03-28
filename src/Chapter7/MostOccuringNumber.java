package Chapter7;
import java.util.Arrays;
public class MostOccuringNumber {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 2, 3, 4, 2};
        int[] newArray = new int[myArray.length];
        int mostOccuringNumber = 0;
        int mostOccur = myArray[1];
        for (int index = 0; index < myArray.length; index++) {
                if (myArray[index] == mostOccur ) {
                    newArray[mostOccur] = myArray[index];
                    mostOccur++;
                    //mostOccuringNumber++;
                }

        }
        System.out.println(Arrays.toString(newArray));
    }
}

