package MenstrualApp;

import InvalidInputException.InvalidInputException;

import java.io.ObjectInputValidation;
import java.util.InputMismatchException;

public class

MenstrualCycleTracker {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        MenstrualCycleTrackingApp tracker = new MenstrualCycleTrackingApp();
        while (true) {
            try {
                System.out.println("Select from list of options what you want to do! ");
                tracker.displayOptions();
                int options = input.nextInt();
                switch (options) {
                    case 1:
                        tracker.signUp();
                        tracker.welcomeMessage();
                        tracker.getUserName();
                        tracker.getUserAge();
                        tracker.displayMenstrualCycleInformation();
                        tracker.calculateMenstrualCycle();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Invalid input");
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.print("Enter a valid input.");
                input.next();
            }
        }

    }
}
