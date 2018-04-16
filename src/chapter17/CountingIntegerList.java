package chapter17;

import java.util.AbstractList;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.CountingIntegerList
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/16
 *     desc   :
 * </pre>
 */

public class CountingIntegerList extends AbstractList<Integer>{

    private int size;

    public CountingIntegerList(int size) {
        this.size = size < 0 ? 0 : size;
    }

    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(20));
    }
}
