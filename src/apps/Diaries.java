package apps;

import InvalidUserNameException.InvalidUserNameException;

import java.util.ArrayList;

public class Diaries {
    private ArrayList<Diary> diaries = new ArrayList<>();
    public void add(String userName, String password){
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }


    public Diary findByUserName(String userName){
        for (Diary myDiaries : diaries) {
            if (userName.equals(myDiaries.getUserName()))
                return myDiaries;
        }
        throw new InvalidUserNameException("UserName not found");
    }

    public int getNumberOfDiaries() {
        return diaries.size();
    }

    public void delete(String userName, String password) {
        for (Diary myDiary : diaries) {
            if (isValid(userName, password, myDiary))
                diaries.remove(myDiary);
            myDiary.getNumberOfEntries();
        }


    }

    private static boolean isValid(String userName, String password, Diary myDiary) {
        return myDiary.getUserName().equals(userName) && myDiary.getPassword().equals(password);
    }
}
