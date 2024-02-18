package capter4;
import javax.script.ScriptContext;
import java.util.Scanner;
public class creditLimitCalculato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account number");
        int accountNumber = input.nextInt();

        System.out.println("Enter beginning balance");
        int beginningBalance = input.nextInt();

        System.out.println("Enter total of items charged buy the customer this month  ");
        int totalItemsCharged = input.nextInt();

        System.out.println("Enter total of all credits applied to customer's account");
        int totalCreditsApplied = input.nextInt();

        System.out.println("Enter allowed credits");
        int allowedCredits = input.nextInt();
    }
}
