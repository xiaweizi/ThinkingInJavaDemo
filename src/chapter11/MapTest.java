package chapter11;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter11.MapTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   :
 * </pre>
 */

class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<Integer, String>();
        data.put(2, "2");
        data.put(1, "1");
        data.put(3, "3");

        System.out.println(data);
    }
}
