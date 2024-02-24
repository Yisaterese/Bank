package apps;

public class Diary {
private boolean isLocked;



    public boolean isLocked() {
        isLocked = false;
            return false;
    }
    public void unLock(String pin) {
        isLocked = true;
    }
    public void lockDiary() {
        isLocked = false;
    }
}
