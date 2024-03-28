package apps;

public class JavaScriptTask {
    public static int[] differenceOfLargestAndSmallestInAList(int[] array){
        int[] newArray = new int[array.length];
        int counter = 0;
        int min = array[0];
        int max = array[array.length-1];
        for(int index = 0; index < array.length; index++){
            newArray[counter] = array[index];
            if(newArray[index] < min){
                min = newArray[index];
            }
            if(newArray[index] > max){
                max = newArray[index];
            }
        }
        return  new int[ ]{max - min};
    }
}
