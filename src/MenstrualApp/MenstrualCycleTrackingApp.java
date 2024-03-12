package MenstrualApp;


import InvalidMonthDayException.InvalidMonthDayException;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualCycleTrackingApp {
    private String name;
    private final ArrayList <User> users = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);
    int ovulationPeriod = 14;

    private void displayAppName() {
        System.out.println("\tWELCOME TO FEMALE LULU.");
    }

    public void welcomeMessage() {
        displayAppName();
        System.out.println("""
                Hi welcome to Female lulu menstrual tracking application, thank you for choosing us.
            
                """);
    }

    public String  getUserName() {
        System.out.print("What is your name?\n");
        String name = input.nextLine();
        System.out.print("Hello..... " + name);
        return name;
    }

    public void getUserAge() {
        System.out.println("  How old are you?.");
        int userAge = input.nextInt();
        int averageMenstruationAge = 12;

        if (userAge < averageMenstruationAge) {
            System.out.println("""
                    Hello! This app is designed for users who have started menstruating and may contain sensitive content related to menstrual health.
                    If you're under 12 years of age and have questions, consider talking to a trusted adult or healthcare provider for guidance. Take care!
                    """);

            System.out.println("Would you like to continue with the app? enter Yes/No: ");
            String response = input.next();

            if (response.equalsIgnoreCase("Yes")) {
                System.out.println("""
                    Hello welcome to Female Lulu Menstrual cycle tracking app!.
                    Track and monitor your menstrual cycle with ease.
                    Get insights, predictions, and helpful reminders.
                    Let's get started!
                 """);
            } else if (response.equalsIgnoreCase("No")) {
                System.out.println("Goodbye, thank you for choosing us.");
                System.exit(0);
            }
        }
    }

    public void displayMenstrualCycleInformation() {
        System.out.print("""
                    What is menstruation?
                    Menstruation is one part of a woman's cycle when the lining of the uterus (endometrium) is shed.
                    This occurs throughout a woman's reproductive life. With each monthly cycle, the endometrium prepares itself to nourish a fetus.
                    Increased levels of estrogen and progesterone help thicken its walls.
                    If fertilization does not occur, the endometrium, along with blood and mucus from the vagina and cervix make up the menstrual flow that leaves the body through the vagina during the period.

                    When does menstruation start?
                    On average, a young woman in the world has her first menstrual period at about age 12.
                    This is generally 2 to 3 years after her breasts start to grow. This is also soon after she notices pubic and underarm hair.
                    Stress, strenuous exercise, and diet can affect when a girl first has her period.

                    The American College of Obstetricians and Gynecologists recommends that a young woman consult her healthcare provider if she has not started to menstruate by the age of 15, or if she has not begun to develop breast buds, pubic hair, or underarm hair by the age of 13.
                    
                    What is ovulation?
                    Ovulation is a phase of the female menstrual cycle that involves the release of an egg (ovum) from one of the ovaries.
                    It generally occurs about two weeks before the start of the menstrual period.
                """);

        System.out.print("""
                    
                    
                    """);
    }

    public void calculateMenstrualCycle() {
        System.out.println("When was the last day of your menstrual flow?.");
        int lastDayOfFlow = input.nextInt();
        int daysOfMonth = 31;
        boolean valid = true;

        while(valid){

            if (lastDayOfFlow < 1) throw new DateTimeException("Enter a valid date");
            else if (lastDayOfFlow > daysOfMonth)throw new DateTimeException("Enter a valid date");
                break;

        }

        System.out.println("What month did you experience the last flow?.");
        int lastFlowMonth = input.nextInt();

        System.out.println("What year was that the last flow?.");
        int yearOfLastFlow = input.nextInt();

        System.out.println("What is the average length of your menstrual cycle");
        int menstrualCycleLength = input.nextInt();

        LocalDate dateOfMenstrualFlow = collectDAteOfMenstrualFlow(yearOfLastFlow, lastFlowMonth, lastDayOfFlow);
        LocalDate nextMenstrualFlow = getNextMenstrualFlow(dateOfMenstrualFlow, menstrualCycleLength);
        System.out.println("Your next menstrual flow will be: " + nextMenstrualFlow);


        LocalDate window = getNextMenstrualFlow(nextMenstrualFlow, ovulationPeriod);
        System.out.println("Your window period will be on " + window);
    }

    private static LocalDate getNextMenstrualFlow(LocalDate dateOfMenstrualFlow, int menstrualCycleLength) {
        return dateOfMenstrualFlow.plusDays(menstrualCycleLength);
    }

    private static LocalDate collectDAteOfMenstrualFlow(int yearOfLastFlow, int lastFlowMonth, int lastDayOfFlow) {
        return LocalDate.of(yearOfLastFlow, lastFlowMonth, lastDayOfFlow);
    }

    public void registerUser(String name) {
        User user = new User(name);
        users.add(user);
    }

    public int numberOfUsers() {
        return users.size();
    }

    public LocalDate checkPeriod(int lastDayOfPeriod, int periodMonth, int yearOfLastPeriod, int averageCycleLength) {
        LocalDate dateOfMenses = collectDAteOfMenstrualFlow(yearOfLastPeriod,periodMonth,lastDayOfPeriod);
        return  getNextMenstrualFlow(dateOfMenses,averageCycleLength);
    }


    public LocalDate checkNextOvulation(int lastDayOfPeriod, int periodMonth, int yearOfLastPeriod, int averageCycleLength) {
        LocalDate dateOfMenses = checkPeriod(lastDayOfPeriod,periodMonth, yearOfLastPeriod,averageCycleLength);
        return getNextMenstrualFlow(dateOfMenses, ovulationPeriod);
    }

    public void setAppName(String name) {
        this.name = name;
    }

    public String getAppName() {
        return name;
    }
}