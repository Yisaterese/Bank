package Chapter7;
import java.util.Arrays;
public class ArrayPractice4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newArray = new int[(array.length + 2)/2];
        int counter= 0;
        for (int index = 0; index < array.length; index += 2) {
            counter++;
            //if(counter >= )break;
                newArray[counter] = array[index];

        }
        System.out.print(Arrays.toString(newArray));
    }
}
