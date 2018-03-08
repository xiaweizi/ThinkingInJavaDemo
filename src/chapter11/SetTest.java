package chapter11;

import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter11.SetTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   :
 * </pre>
 */

class SetTest {
    public static void main(String[] args) {
        Set<Integer> data = new HashSet<Integer>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.remove(4);
        System.out.println(data.remove(1));
        System.out.println(data);
    }
}
