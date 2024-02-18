package capter4;
import java.util.Scanner;
public class lengthOfTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of triangle");
        int input = scanner.nextInt();

        for(int row = 1; row <= input; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
        }
//        System.out.print();
    }

}
