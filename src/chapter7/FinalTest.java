package chapter7;

import java.util.Arrays;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter7.FinalTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/03
 *     desc   :
 * </pre>
 */

class FinalTest {
    private static final String name = "jack";
    private static final Shape shape = new Shape(2);
    private static final int[] ints = new int[10];
    public static void main(String[] args) {
//        name = "d";
        Shape shape1 = new Shape(3);
        shape1 = shape1;
        System.out.println("age:" + shape1.toString());
        ints[1] = 2;
        System.out.println(Arrays.toString(ints));
    }

}
