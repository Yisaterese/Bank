package apps;

import InvalidBodyException.InvalidBodyException;
import InvalidPasswordException.InvalidPasswordException;
import InvalidTitleException.InvalidTitleException;

import java.util.ArrayList;

public class Diary {
private final ArrayList<Entry> entries = new ArrayList<>();
private boolean isLocked;
private int numberOfEntries;
private int id = 1;
private  String userName;
private final String password;

    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public static Diary createDiary(String userName, String password) {
        return new Diary(userName, password);
    }

    public boolean isLocked() {
            return  isLocked ;
    }
    public void unLock(String pin) {
        if(!isValid(pin)) throw new InvalidPinException("Incorrect pin");
        isLocked = true;
    }
    public void lockDiary() {
        isLocked = false;
    }
    public boolean isValid(String theCorrectPin){
        return theCorrectPin.length() == 10;
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void createEntry(String titleOfEntry, String bodyOfEntry) {
        Entry entry = new Entry(titleOfEntry, bodyOfEntry);
        entry.setId(id++);
        entries.add(entry);
    }

    public void deleteEntry(int identification) {
        Entry foundEntry = findEntryById(identification);
        entries.remove(foundEntry);
        numberOfEntries--;
       // entries.remove(findEntryById(identification));

    }
    public Entry findEntryById(int identification){
            for(Entry entry: entries){
                if(entry.getId() == identification)
                    return entry;
            }
        throw new InvalidIdException("entry not found");
    }
    private boolean isCorrect(int identification) {
        if(identification >= 1)
            return getId() == identification;
        throw new InvalidIdException("Incorrect id");
    }

    public int getId(){
        return id;
    }
    public boolean isEquals(int identification){
        for(Entry entry : entries) {
            if (entry.equals(identification))
                return true;
        }
        return false;
    }

    public void upDateEntry(int id, String titleOfEntry, String bodyOfEntry ) {
         Entry foundEntry = findEntryById(id);
         foundEntry.setTitle(titleOfEntry);
         foundEntry.setBodyOfEntry(bodyOfEntry);
         entries.remove(foundEntry);
         entries.add(foundEntry);
    }




    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
