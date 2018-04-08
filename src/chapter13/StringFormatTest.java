package chapter13;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter13.StringFormatTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/08
 *     desc   : 1
 * </pre>
 */

class StringFormatTest {

    public static void main(String[] args) {

        // common test
        String format = String.format("My name is %s, age is %d", "xiaweizi", 12);
        System.out.println(format);

    }

}
