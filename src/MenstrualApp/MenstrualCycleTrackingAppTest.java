package MenstrualApp;

import MenstrualApp.MenstrualCycleTrackingApp;
import org.junit.jupiter.api.Test;

class MenstrualCycleTrackingAppTest {

    @Test
    public void testCanCheckAppName(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
       // mensesTrackApp.setAppName("Female lulu");
        //assertEquals("Female lulu",mensesTrackApp.getAppName());
    }


    @Test
    public void testCanCheckUserName(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        mensesTrackApp.getUserName();

    }

    @Test
    public void testWelcomeMessage(){
        MenstrualCycleTrackingApp mensesTrackApp = new MenstrualCycleTrackingApp();
        //mensesTrackApp.displayWelcomeMessage();

    }



}