package chapter12;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter12.StackTraceTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/09
 *     desc   : 3
 * </pre>
 */

class StackTraceTest {
    static void f() {
        try {
            throw new NullPointerException("null");
        } catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.getMethodName());
            }

        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("----------");
        g();
        System.out.println("----------");
        h();
    }
}
