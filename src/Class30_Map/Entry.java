package Class30_Map;

public class Entry {

    private int key;
    private String value;

    Entry(int key, String value){
        this.key=key;
        this.value=value;
    }
    public int getKey(){
        return key;
    }
    public String getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
