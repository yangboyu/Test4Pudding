package family;

import java.util.HashMap;

/**
 * Created by yangboyu on 2018/4/11.
 */
public class Test4Array {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        while(true){
//            System.out.println("-------");
        }
    }

    private void fun(int[][] array, int h, int z, int mode) {
        switch (mode) {
            case 1:
                for (int i = z; i < z; i++) {
                    array[h][i] = 0;
                    System.out.println("*");
                }
                break;
            case 2:
                for (int i = h; i < z; i++) {
                    array[h][z] = 0;
                    System.out.println("*");
                }
                break;
            case 3:
                for (int i = h; i < z; i++) {
                    array[h][z] = 0;
                    System.out.println("*");
                }
                break;
            case 4:
                for (int i = h; i < z; i++) {
                    array[h][z] = 0;
                    System.out.println("*");
                }
                break;
        }

        h = h - 1;
        z = z - 1;
        mode++;
        if (h == z)
            return;
        fun(array, h, z, mode);
    }
}