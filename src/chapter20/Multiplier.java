package chapter20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter20.Multiplier
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/19
 *     desc   :
 * </pre>
 */

@ExtractInterface("Multiplier")
public class Multiplier {
    public int multiply(int x, int y) {
        int total = 0;
        for (int i = 0; i < x; i++) {
            total = add(total, y);
        }
        return total;
    }

    int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.multiply(11, 16));
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@interface ExtractInterface {
    String value();
}