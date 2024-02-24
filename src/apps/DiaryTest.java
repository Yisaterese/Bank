package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiaryTest {
    private Diary diary;
    @Test
    public void checkDiaryIsLock_diaryIsLocked(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());
    }
    @Test
    public void unLock_diaryIsUnLocked(){
        Diary diary = new Diary();
        diary.lockDiary();
        assertFalse(diary.isLocked());
        diary.unLock("correctPin");
        assertTrue(diary.isLocked());
    }
}
