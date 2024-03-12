package MenstrualApp;

import InvalidMonthDayException.InvalidMonthDayException;
import InvalidUserNameException.InvalidUserNameException;
import MenstrualApp.MenstrualCycleTrackingApp;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MenstrualCycleTrackingAppTest {

    @Test
    public void testCanCheckAppName(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.setAppName("Female lulu");
        assertEquals("Female lulu",mensesTrackApp.getAppName());
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
    public void  userEntersInvalidDate_throwInvalidDateExceptionTest(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.registerUser("Azeez");
        assertThrows(DateTimeException.class,() -> mensesTrackApp.checkNextOvulation(33,3,2024, 28));
    }

    @Test
    public void  registerTwoUsersWithSameUserName_throwInvalidUserNameExceptionTest(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.registerUser("Azeez");
        assertThrows(InvalidUserNameException.class,() -> mensesTrackApp.registerUser("Azeez"));
    }



}