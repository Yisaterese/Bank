package apps;

import java.util.Arrays;

public class TwoDArrayPractice {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j]= (int)(Math.random()*100);
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        // while is the enhanced loop printing an array of 4 elements each 12x ?
        for(int[] i : numbers){
            for (int j : i){
                System.out.print(Arrays.toString(i) +" ");
            }
            System.out.println();
        }
    }
}