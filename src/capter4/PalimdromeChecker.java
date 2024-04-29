package capter4;
import java.util.Arrays;
import java.util.Scanner;
public class PalimdromeChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a palindrome");
        String palindrome = input.nextLine();

        char[] palindromeArray = palindrome.toCharArray();
        char[] newPalindrome = palindromeArray;
        int counter = 0;

        for(int index = 0; index < palindromeArray.length; index++ ){
            newPalindrome[counter] = palindromeArray[index];

            char pickCharIndex = palindrome.charAt(index);
            int numericValues = Character.getNumericValue(pickCharIndex);

        }





    }

}