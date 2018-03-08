package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter11.Collctions
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   :
 * </pre>
 */

class Collctions {

    public static void main(String[] args) {
        Integer[] datas = new Integer[]{1,2,3};
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(datas));

        System.out.println(collection);
    }
}
