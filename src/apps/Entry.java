package apps;

public class Entry {
    private int id;
    private String titleOfEntry;
    private String bodyOfEntry;
    public Entry(String titleOfEntry, String bodyOfEntry) {
        this.titleOfEntry = titleOfEntry;
        this.bodyOfEntry = bodyOfEntry;
    }

    public void setId(int id) {
        this.id = id;
    }
}
