package Chapter7;
import java.util.Arrays;
public class ArrayPractice1 {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,};
        int[] newArray = new int[array.length];
        int counter = 0;
        for(int index = array.length-1; index >= 0; index--) {
            newArray[counter] = array[index];
            counter++;
        }
        System.out.print(Arrays.toString(newArray));
    }
}
