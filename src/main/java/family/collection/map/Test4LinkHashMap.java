package family.collection.map;

import java.util.LinkedHashMap;

/**
 * Created by yangboyu on 2018/3/22.
 */
public class Test4LinkHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("a", "a");
        hashMap.put("a1", "a1");
        hashMap.put("a2", "a2");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
    }
}
