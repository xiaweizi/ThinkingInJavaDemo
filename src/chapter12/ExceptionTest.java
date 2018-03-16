package chapter12;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter12.ExceptionTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/09
 *     desc   : 1. 普通使用
 * </pre>
 */

class ExceptionTest {
    public static void main(String[] args) {
        int a = 0;
        try {
            System.out.println("1111");
            if (a == 0) {
                System.out.println("2222");
                throw new NullPointerException("a cannot be 0");
            }
        } catch (Exception e) {
            System.out.println("3333");
            e.printStackTrace();
            System.out.println("e:" + e.getMessage());
        } finally {
            System.out.println("4444");
        }
    }
}
