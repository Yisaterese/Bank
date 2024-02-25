package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;
    @Test
    public void checkDiaryIsLock_diaryIsLockedTest(){
        Diary diary = Diary.createDiary("'Ase", "correctPassword");
        assertFalse(diary.isLocked());
    }
    @Test
    public void unLock_diaryIsUnLockedTest(){
        Diary diary = Diary.createDiary("'Asenso", "correctPassword");
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
    }
    @Test
    public void unLockWithWrongPin_throwsInvalidPinExceptionTest(){
        Diary diary = Diary.createDiary("'senso", "correctPassword");
        assertFalse(diary.isLocked());
        assertThrows(InvalidPinException.class,()->diary.unLock("IncorrectPin"));
    }

    @Test
    public void lockDiary_diaryIsLockedTest(){
        Diary diary = Diary.createDiary("'Aseo", "correctPassword");
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        diary.lockDiary();
        assertFalse(diary.isLocked());
    }

    @Test
    public void createEntry_numberOfDiaryIncreasedToOneTest(){
        Diary diary = Diary.createDiary("'Asa", "correctPassword");
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    public void createTwoEntries_deleteOneTest(){
        Diary diary = Diary.createDiary("CR7", "correctPassword");
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
        Diary diary = Diary.createDiary("Pessi", "correctPassword");
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
        Diary diary = Diary.createDiary("Bez", "correctPassword");
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        assertEquals(2, diary.getNumberOfEntries());
        assertThrows(InvalidIdException.class,()-> diary.deleteEntry(-1));
    }

    @Test
    public void updateEntry_entryIsUpToDateTest(){
        Diary diary = Diary.createDiary("Ali", "correctPassword");
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
        diary.createEntry("My first experience at beach", "I saw beautiful ladies");
        diary.createEntry("My first experience in lagos", "I saw shege");
        diary.upDateEntry(1, "My first day as a native", "Everything  was weird");
        Entry diary1 = diary.findEntryById(1);
        assertEquals("My first day as a native",diary1.getTitleOfEntry());

    }
}
