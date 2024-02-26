package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiariesTest {
    @Test
    public void addToListOfDiaries_diarySizeIncreasedByOneTest(){
        Diaries diaries = new Diaries();
        diaries.add("Asa", "correctPassword");
        assertEquals(1,diaries.getNumberOfDiaries());
    }

    @Test
    public void addToListOfDiaries_findDiaryByUserNameTest(){
        Diaries diaries = new Diaries();
        diaries.add("Asa", "correctPassword");
        assertEquals(1,diaries.getNumberOfDiaries());
        Diary diary1 = diaries.findByUserName("Asa");
        assertEquals(diary1, diaries.findByUserName("Asa"));
    }

    @Test
    public void addToListOfDiaries_deleteTest(){
        Diaries diaries = new Diaries();
        Diary diary = new Diary("username", "password");
        diaries.add("username", "password");
        assertEquals(1,diaries.getNumberOfDiaries());
        diaries.delete("username", "password");
        assertEquals(0,diaries.getNumberOfDiaries());
    }

}
