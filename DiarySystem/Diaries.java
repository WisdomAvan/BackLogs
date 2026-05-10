package DiarySystem;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
//    private String userName;
//    private String password;
    private List<Diary> collectionOfDiary = new ArrayList<>();

    public List<Diary> getDiaries() {
        return collectionOfDiary;
    }

    public void add(String userName, String password) {
        for (Diary diary : collectionOfDiary) {
            if (diary.getUserName().equals(userName)) {
                throw new IllegalArgumentException("Diary already exists");
            }
        }
        Diary diary = new Diary(userName, password);
        collectionOfDiary.add(diary);
    }

    public Diary findByUsername(String userName) {
        for(Diary diary : collectionOfDiary){
            if(diary.getUserName().equalsIgnoreCase(userName)){
                return diary;
            }
        }
        return null;
    }

    public Diary delete(String userName, String password) {
        for(Diary diary : collectionOfDiary) {
            if(diary.getUserName().equalsIgnoreCase(userName) && diary.unLockDiary(password));{
                collectionOfDiary.remove(diary);
                return diary;
            }
        }
        return null;
    }
}

