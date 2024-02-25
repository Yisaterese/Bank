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

    public void delete(String userName, String Password) {

    }
}
