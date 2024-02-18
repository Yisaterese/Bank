package Chapter7;

import java.util.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,};
        int[] newArray = new int[array.length];
        int counter = 0;
        for(int index = 1; index < array.length; index +=2 ){
            counter++;
        }
        int [] returnValue = new int [counter];
        int num =0;
        for(int index = 1; index < array.length; index +=2) {
            returnValue[num++] = array[index];
        }
        System.out.printf("%s",Arrays.toString(returnValue));



    }
}
