package family.collection.list;

import java.util.*;

/**
 * Created by yangboyu on 2018/3/22.
 */
public class Test4LinkList {
    private static class Test4ClassHashCode{

    }
    private static int SIZE = 111111;

    private static void loopList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.println(list.getClass().getSimpleName() + "使用普通for循环遍历时间为" +
                (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (Integer i : list) {

        }
        System.out.println(list.getClass().getSimpleName() + "使用foreach循环遍历时间为" +
                (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        list.add(1);



        Test4ClassHashCode classHashCode = new Test4ClassHashCode();
        Integer i0 = 4;
        Integer i1 = 10;
        Integer i2 = 6;
        Integer i3 = i0 + i2;
        System.out.println(i1 == i3);
        String s1 = "11";
        String s2 = "1";
        String s3 = s2 + s2;
        System.out.println(s1.toString());
        System.out.println(s1 == s3);
//        List<Integer> arrayList = new ArrayList<Integer>(SIZE);
//        List<Integer> linkedList = new LinkedList<Integer>();
//        System.out.println(arrayList.hashCode());
//        for (int i = 0; i < SIZE; i++) {
//            arrayList.add(i);
//            linkedList.add(i);
//        }
//
//        loopList(arrayList);
//        loopList(linkedList);
//        System.out.println();
    }
}
