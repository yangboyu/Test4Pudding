package family.collection.map;

import java.util.HashMap;

/**
 * Created by yangboyu on 2018/3/22.
 */
public class Test4HashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("a", "a");
        hashMap.put("a", "a1");
        hashMap.put("a", "a2");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
    }
}
