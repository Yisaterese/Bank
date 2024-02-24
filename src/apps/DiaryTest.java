package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;
    @Test
    public void checkDiaryIsLock_diaryIsLockedTest(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
    }
    @Test
    public void unLock_diaryIsUnLockedTest(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
    }
    @Test
    public void unLockWithWrongPin_throwsInvalidPinExceptionTest(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
        assertThrows(InvalidPinException.class,()->diary.unLock("IncorrectPin"));
    }

    @Test
    public void lockDiary_diaryIsLockedTest(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        diary.lockDiary();
        assertFalse(diary.isLocked());
    }

    @Test
    public void createEntry_numberOfDiaryIncreasedToOneTest(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    public void createTwoEntries_deleteOneTest(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        assertEquals(2, diary.getNumberOfEntries());
        diary.deleteEntry(diary.getId());
        assertEquals(1,diary.getNumberOfEntries());
    }
    @Test
    public void createTwoEntries_deleteOneWithWrongId_throwInvalidExceptionTest(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        assertEquals(2, diary.getNumberOfEntries());
        assertThrows(InvalidIdException.class,()-> diary.deleteEntry(5));
    }


    @Test
    public void deleteEntryWithWrongIdOfNegativeNumbers_throwInvalidIdExceptionTest(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        assertEquals(2, diary.getNumberOfEntries());
        assertThrows(InvalidIdException.class,()-> diary.deleteEntry(-1));
    }
}
