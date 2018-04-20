package family.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yangboyu on 2018/4/12.
 */
public class Test4ConcurrentModificationException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer == 2)
                iterator.remove();
//                list.remove(integer);

            System.out.println(integer);
        }
        System.out.println("-----------");
        for (Integer i : list) {
            System.out.println(i);
        }
    }

//    class Test4Thread implements Runnable {
//        public
//        @Override
//        public void run() {
//
//        }
//    }
}
