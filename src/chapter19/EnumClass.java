package chapter19;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter19.EnumClass
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class EnumClass {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + "ordinal:" + color.ordinal());
            System.out.println(color.getDeclaringClass());
            System.out.println(color.name());
        }
    }
}

enum Color {
    RED, GREEN, BLUE;
}
