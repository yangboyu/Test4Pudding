package family.test2;

/**
 * Created by yangboyu on 2018/4/13.
 */
public final class Test4Final {

    private int a = 10;
    private final String s = "abc";
    private final static String b = "vbv";

    public static void main(String[] args) {
        Test4Final test4Final = new Test4Final();
        test4Final.test();
    }

    public void test() {
        Test4InnerClass test4InnerClass = new Test4InnerClass();
        test4InnerClass.test4InnerMethod();
        String aa = test4InnerClass.bbbbb;

        Test4InnerStaticClass test4InnerStaticClass = new Test4InnerStaticClass();
        test4InnerStaticClass.test4InnerMethod();
        Test4InnerStaticClass.test4InnerStaticMethod();
    }

    class Test4InnerClass {
        private String bbbbb;
        public void test4InnerMethod() {
            System.out.println(String.format("%s-%s-%s", a, s, b));

//            test();
        }
    }

    static class Test4InnerStaticClass {
        public void test4InnerMethod() {
            System.out.println(String.format("%s-%s-%s", b, b, b));
            System.out.println("Test4InnerStaticClass");
        }


        static void test4InnerStaticMethod() {
            System.out.println("test4InnerStaticMethod");
        }
    }
}
