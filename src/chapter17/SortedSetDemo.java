package chapter17;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.SortedSetDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/17
 *     desc   :
 * </pre>
 */

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();
        Collections.addAll(sortedSet,
                "one two three four five six seven eight".split(" "));
        System.out.println("sortedSet = " + sortedSet); // sortedSet = [eight, five, four, one, seven, six, three, two]

        String low = sortedSet.first(); // 第一个元素
        String high = sortedSet.last(); // 最后一个元素
        System.out.println("low = " + low);
        System.out.println("high = " + high);

        Iterator<String> it = sortedSet.iterator(); // 迭代器
        for (int i = 0; i <= 6; i++) {
            if (i == 3)
                low = it.next();
            if (i == 6)
                high = it.next();
            else
                it.next();
        }
        System.out.println(low); // one
        System.out.println(high); // two
        System.out.println(sortedSet.subSet(low, high)); // 子集（包括low，不包括high）：[one, seven, six, three]
        System.out.println(sortedSet.headSet(high)); // 元素值小于high的子集： [eight, five, four, one, seven, six, three]
        System.out.println(sortedSet.tailSet(low)); // 元素值大于等于low的子集：[one, seven, six, three, two]
        System.out.println("sortedSet.comparator() = " + sortedSet.comparator()); // sortedSet.comparator() = null（自然排序）
    }
}