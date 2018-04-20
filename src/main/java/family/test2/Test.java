package family.test2;

/**
 * Created by yangboyu on 2018/4/13.
 */
public class Test {

    public static void main(String[] args) {
        Test4Final test4Final = new Test4Final();
        Test4Final.Test4InnerClass innerClass = test4Final.new Test4InnerClass();
        innerClass.test4InnerMethod();

    }

    private String fun4() {
        try {
            return "aaa";
        } finally {
            System.out.println("----");
        }
    }
}

