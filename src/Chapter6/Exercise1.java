package Chapter6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int i = 14;
        int j = 1;
        int k = 5;
        int smallest;

        if(i <= j && i <= k) {
            smallest = i;
        } else if(j <= i && j <= k) {
            smallest = j;
        } else {
            smallest = k;
        }

        System.out.println(smallest + " is the smallest number");
    }


}
