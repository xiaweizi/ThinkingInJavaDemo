package chapter16;

import java.util.Arrays;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter16.ArrayTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/11
 *     desc   :
 * </pre>
 */

class ArrayTest {

    public static void main(String[] args) {
        float[][] a = new float[2][3];
        String s = Arrays.toString(a);
        System.out.println(s);
    }

    public static <T> T[] get(T[] arg) {
        return arg;
    }
}
