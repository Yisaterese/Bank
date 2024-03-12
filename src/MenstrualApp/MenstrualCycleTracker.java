package MenstrualApp;

import InvalidInputException.InvalidInputException;

import java.io.ObjectInputValidation;

public class

MenstrualCycleTracker {
    public static void main(String[] args) {
        java.util.Scanner input = new  java.util.Scanner(System.in);
        MenstrualCycleTrackingApp tracker = new MenstrualCycleTrackingApp();

        try {
            while(true){
                System.out.println("Select from list of options what you want to do! ");
                tracker.displayOptions();
                int options = input.nextInt();
                switch (options) {
                    case 1:
                        tracker.signUp();
                        //tracker.displayOptions();
                        //break;
                    case 2:
                        tracker.welcomeMessage();
                        tracker.getUserName();
                        tracker.getUserAge();
                        tracker.displayMenstrualCycleInformation();
                        tracker.calculateMenstrualCycle();
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
            }catch (InvalidInputException ex){
                System.out.println("Enter a valid input.");
            }

    }

}
