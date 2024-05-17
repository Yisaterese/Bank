package apps;

import java.util.Arrays;

public class Addition {
    public static int addWithOutUsingAddition(int number1, int number2 ) {
        return number1 - - number2;
    }

    public static int addWithOutAdding(int ...numbers){
        int[]array = new int[1];
        for(int atEveryIndex = 0; atEveryIndex <= numbers.length-1; atEveryIndex++){
            array[0] =  array[0] - - numbers[atEveryIndex];
        }
        return  array[0];
    }
    public static void populateEmptyArray(int[][] numbers){
        for (int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[0].length; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      populateEmptyArray(numbers);
    }


}
