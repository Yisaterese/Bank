package apps;

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


}
