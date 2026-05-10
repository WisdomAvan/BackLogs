package DiarySystem;
//import java.util.TimeZone;
public class Entry {
    private int id;
    private String title;
    private String body;

    public Entry(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;

    }


    public void setTitle(String title){
        this.title = title;
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getTitle(){
        return String.format(title);
    }

    public String getBody(){
        return String.format(body);
    }

    public int getId(){
        return id;
    }

}

