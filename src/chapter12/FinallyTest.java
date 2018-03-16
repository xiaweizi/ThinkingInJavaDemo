package chapter12;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter12.FinallyTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/09
 *     desc   : 4
 * </pre>
 */

class FinallyTest {

    static void f(int i) {
        try {
            System.out.println("111");
            if (i == 1) {
                return;
            }
            System.out.println("222");
            if (i ==2) {
                return;
            }
            System.out.println("222");
            if (i ==3) {
                return;
            }
            System.out.println("end");

        } finally {
            System.out.println("finally clean up");
        }
    }
    public static void main(String[] args) throws Exception{
        for (int i = 1; i < 5; i++) {
            f(i);
        }
        System.out.println("5555555");
        throw new NullPointerException("dd");
    }
}
