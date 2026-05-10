package DiarySystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Diary {
    private String userName;
    private final String passWord;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<>();


    public Diary(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return this.userName = userName;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean unLockDiary(String inputPassword) {
        if (this.passWord.equalsIgnoreCase(inputPassword)) {
            return this.isLocked = false;
        }
        return this.isLocked = true;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public void createEntry(int id, String title, String body) {
        if (this.isLocked) throw new IllegalStateException("Diary is locked");
        {
            entries.add(new Entry(id, title, body));
        }
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void unLock() {
        this.isLocked = false;
    }

    public Entry findEntryById(int entryId) {
        return entries.stream().filter(entry -> entry.getId() == entryId)
                .findFirst()
                .orElse(null);
    }

    public void deleteEntry(int Id) {
        entries.removeIf(entry -> entry.getId() == Id);
    }

    public void updateEntry(int id, String title, String body) {
        boolean found = false;
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                entry.setTitle(title);
                entry.setBody(body);
                found = true;
            }
        }
        if (!found) throw new IllegalStateException("Id not found");
    }
}







