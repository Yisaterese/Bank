package DiaryApp;

import InvalidPasswordException.InvalidPasswordException;
import InvalidUserNameException.InvalidUserNameException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        diaries.add("Aje", "correctPassword");
        assertEquals(1,diaries.getNumberOfDiaries());
        diaries.delete("Aje", "correctPassword");
        assertEquals(0,diaries.getNumberOfDiaries());
    }

    @Test
    public void deleteWithWrongUserName_throwInvalidUserNameExceptionTest(){
        Diaries diaries = new Diaries();
        diaries.add("Aje", "correctPassword");
        assertEquals(1,diaries.getNumberOfDiaries());
        assertThrows(InvalidUserNameException.class,()->diaries.delete("Asa", "correctPassword"));
    }
    @Test
    public void deleteWithWrongPassword_throwInvalidPasswordExceptionTest(){
        Diaries diaries = new Diaries();
        diaries.add("Aje", "correctPassword");
        assertEquals(1,diaries.getNumberOfDiaries());
        assertThrows(InvalidPasswordException.class,()->diaries.delete("Aje", "IncorrectPassword"));
    }


    @Test
    public void addThreeDiariesToListOfDiaries_deleteSecondDiaryTest(){
        Diaries diaries = new Diaries();
        diaries.add("Aje", "correctPassword");
        diaries.add("mojo", "password");
        diaries.add("polo", "correctPassword");
        assertEquals(3,diaries.getNumberOfDiaries());
        diaries.delete("mojo", "password");
        assertEquals(2, diaries.getNumberOfDiaries());
    }
}


