package chapter17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.CollectionDataTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/16
 *     desc   : 2
 * </pre>
 */

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 10));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(), 10));
        System.out.println(set);
    }
}

interface Generator<T> {
    T next();
}
class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds "
            + "distributing swords is no basis for a system of " + "government")
            .split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}

class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }
    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<>(gen, quantity);
    }
}