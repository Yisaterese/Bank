package MenstrualApp;

import MenstrualApp.MenstrualCycleTrackingApp;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenstrualCycleTrackingAppTest {

    @Test
    public void testCanCheckAppName(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.setAppName("Female lulu");
        assertEquals("Female lulu",mensesTrackApp.getAppName());
    }


    @Test
    public void testCanCheckUserName(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
//        mensesTrackApp.getUserName();
//
    }

    @Test
    public void registerUser_numberOfUserIsOneTest(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.registerUser("Damilola");
        assertEquals(1,mensesTrackApp.numberOfUsers());
    }

    @Test
    public void  checkUserSNextPeriodTest(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.registerUser("Ajosse");
        LocalDate expectedOutPut = LocalDate.of(2024,03,30);
        assertEquals(expectedOutPut ,mensesTrackApp.checkPeriod(2,3,2024, 28));

    }

    @Test
    public void  checkUsersNextOvulationTest(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.registerUser("Ajosse Adeogun");
        LocalDate expectedOutPut = LocalDate.of(2024,04,13);
        assertEquals(expectedOutPut ,mensesTrackApp.checkNextOvulation(2,3,2024, 28));

    }

    @Test
    public void  checkUsersMTest(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.registerUser("Ajosse Adeogun");
        LocalDate expectedOutPut = LocalDate.of(2024,04,13);
        assertEquals(expectedOutPut ,mensesTrackApp.checkNextOvulation(2,3,2024, 28));

    }
}