package family.collection.map;


import java.util.Hashtable;

/**
 * Created by yangboyu on 2018/3/22.
 */
public class Test4HashTable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("a", "a");
        hashtable.put("a", "a1");
        hashtable.put("a", "a2");
        for (String value : hashtable.values()) {
            System.out.println(value);
        }
    }
}