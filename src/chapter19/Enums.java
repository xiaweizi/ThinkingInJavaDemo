package chapter19;

import java.util.Random;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter19.Enums
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class Enums {
    public static Random rand = new Random(47);
    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }
    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }

    public static void main(String[] args) {
        Woker random = random(Woker.class);
        System.out.println(random);

    }
}

enum Woker {
    AA,BB,CC
}