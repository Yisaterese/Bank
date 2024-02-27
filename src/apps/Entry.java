package apps;

public class Entry {
    private int id = 0;
    private String titleOfEntry;
    private String bodyOfEntry;
    public Entry(String titleOfEntry, String bodyOfEntry) {
        this.titleOfEntry = titleOfEntry;
        this.bodyOfEntry = bodyOfEntry;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String getTitleOfEntry(){
        return titleOfEntry;
    }

    public String getBodyOfEntry() {return bodyOfEntry;
    }

    public void setTitle(String titleOfEntry) {
        this.titleOfEntry = titleOfEntry;
    }

    public void setBodyOfEntry(String bodyOfEntry) {
        this.bodyOfEntry = bodyOfEntry;
    }
}
