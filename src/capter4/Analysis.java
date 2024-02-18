package capter4;
import java.util.Scanner;
public class Analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pass = 0;
        int fail = 0;

        for(int counter = 0; counter < 10; counter++){
            System.out.println("Enter 1 or 2 to verify rades");
            int number = input.nextInt();
            if(number == 1){
                pass++;
            }else{
                fail++;
            }
            if(pass >= 8){
                System.out.println("Bonus to instructor");
            }
            if(number < 1 || number > 2){
                number = input.nextInt();
            }
        }
        System.out.println("The number of passes are: +"+pass);
        System.out.println("The number of fails are: "+fail);
    }
}

