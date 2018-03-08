package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter11.IteratorTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   :
 * </pre>
 */

class IteratorTest {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        ListIterator<Integer> integerListIterator = data.listIterator(2);
        while (integerListIterator.hasNext()) {
            Integer next = integerListIterator.next();
            System.out.println("next:" + next);
        }

        while (integerListIterator.hasPrevious()) {
            Integer previous = integerListIterator.previous();
            System.out.println("previous:" + previous);
        }
    }

    private static void iterator() {
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("data: " + next);
        }

        iterator = data.iterator();
        for (int i = 0; i < 4; i++) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(data);
    }
}
