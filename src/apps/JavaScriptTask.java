package apps;

public class JavaScriptTask {
    public static int[] differenceOfLargestAndSmallestInAList(int[] array){
        int min = array[0];
        int max = array[array.length-1];
        for(int index = 0; index < array.length; index++){
            if(array[index] < min) min = array[index];
            if(array[index] > max)max = array[index];
        }
        return  new int[]{max - min};
    }
}
