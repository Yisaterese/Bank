package Chapter7;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,};
        int sum = 0;
        for(int index = array.length-1; index >= 0; index--) {
            sum += array[index];

        }
        System.out.print(sum);

    }
}
