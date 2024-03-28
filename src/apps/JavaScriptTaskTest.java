package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaScriptTaskTest {
    @Test
    public void differenceOfLargestAndLowestInAListTest(){
        int[] myArray = {2,4,5,7,8};
        assertEquals(new int[] {6},JavaScriptTask.differenceOfLargestAndSmallestInAList(myArray));

    }

}