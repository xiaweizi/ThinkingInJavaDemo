import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : PACKAGE_NAME.Utilities
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/17
 *     desc   :
 * </pre>
 */

public class Utilities {
    /* Arrays.asList() 产生是list大小是固定的，不能执行add() 操作（会抛异常），但是可以修改即set() 操作*/
    static List<String> list = Arrays.asList("one Two three Four five six one".split(" "));

    public static void main(String[] args) {
        System.out.println("list = " + list);
        // Collections.disjoint(c1,c2)：当两个集合没有相同元素时返回true. disjoint == 互斥，不相交的；

        // Collections.singletonList("Four"): 产生不可变的Set, List, Map， 它们都只包含基于给定参数的内容而形成的单一项；
        System.out.println("Collections.disjoint(list, Collections.singletonList(\"Four\")) = " + Collections.disjoint(list, Collections.singletonList("Four")));

        // Collections.max() 求最大元素 （默认字符大小写敏感）
        System.out.println("Collections.max(list) = " + Collections.max(list));

        // Collections.min() 求最小元素 （默认字符大小写敏感）
        System.out.println("Collections.min(list) = " + Collections.min(list));

        // Collections.max(list, String.CASE_INSENSITIVE_ORDER)) 在不考虑字母大小写敏感的基础上求最大元素；
        System.out.println("Collections.max(list, String.CASE_INSENSITIVE_ORDER) = " + Collections.max(list, String.CASE_INSENSITIVE_ORDER));

        // Collections.min(list, String.CASE_INSENSITIVE_ORDER)) 在不考虑字母大小写敏感的基础上求最小元素；
        System.out.println("Collections.min(list, String.CASE_INSENSITIVE_ORDER) = " + Collections.min(list, String.CASE_INSENSITIVE_ORDER));

        // Arrays.asList() 产生是list大小是固定的
        List<String> sublist = Arrays.asList("Four five six".split(" "));
        System.out.println("Arrays.asList(\"Four five six\".split(\" \")) = " + sublist);

        // Collections.indexOfSubList(list, sublist) 返回sublist在list中第一次出现的位置，或者找不到时返回 -1；
        System.out.println("Collections.indexOfSubList(list, sublist) =  " + Collections.indexOfSubList(list, sublist)); // 返回3，注意

        // Collections.lastIndexOfSubList(list, sublist) 返回sublist在list中最后一次出现的位置，或者找不到时返回 -1；
        System.out.println("Collections.lastIndexOfSubList(list, sublist) =  " + Collections.lastIndexOfSubList(list, sublist)); // 返回3，注意

        // Collections.replaceAll(list, "one", "Yo"), 用 Yo 替换 list中的所有 one
        Collections.replaceAll(list, "one", "Yo");
        System.out.println("Collections.replaceAll(list, \"one\", \"Yo\"), list = " + list);

        // Collections.reverse(list), 逆转list中所有元素的顺序
        Collections.reverse(list);
        System.out.println("Collections.reverse(list), list = " + list);

        // Collections.rotate(list, 3); 所有元素向后移动 3个位置，并将末尾的元素循环移到前面去；
        Collections.rotate(list, 3);
        System.out.println("Collections.rotate(list, 3), list =  " + list);

        List<String> source = Arrays.asList("in the matrix".split(" "));
        System.out.println("Arrays.asList(\"in the matrix\".split(\" \")) = source = " + source);

        // Collections.copy(list, source)， 将source中的元素复制到list中（从位置0开始复制），若source元素数量小于list，则list后面的元素会保留；
        Collections.copy(list, source);
        System.out.println("Collections.copy(list, source), list = " + list);

        // Collections.swap(list, i, j), 交换list中 位置i 和位置j 的元素
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("Collections.swap(list, 0, list.size() - 1), list = " + list);

        // Collections.shuffle(list, new Random(47)), 随机改变指定列表的顺序, 也可以不指定 Random，而使用默认的Random
        Collections.shuffle(list, new Random(47));
        System.out.println("Collections.shuffle(list, new Random(47)), list = " + list);

        // Collections.fill(list, "pop"), 用 pop 替换list中的所有元素；
        Collections.fill(list, "pop");
        System.out.println("Collections.fill(list, \"pop\"), list = " + list);

        // Collections.frequency(list, "pop")，返回list中 等于 pop 的元素个数
        System.out.println("Collections.frequency(list, \"pop\") = " + Collections.frequency(list, "pop"));

        // Collections.nCopies(3, "snap"), 返回大小为3的 且大小和值均不可改变的List， 所有元素都引用 snap；
        List<String> dups = Collections.nCopies(3, "snap");
        System.out.println("Collections.nCopies(3, \"snap\") = dups = " + dups);

        // Collections.disjoint(list, dups) 两个集合如果不相交，没有交集，返回true， 否则返回false
        System.out.println("Collections.disjoint(list, dups) = " + Collections.disjoint(list, dups));
        System.out.println("Collections.disjoint(list, dups), list = " + list);

        // Collections.enumeration(dups)， 为参数dups 生成一个 旧式 枚举类
        Enumeration<String> e = Collections.enumeration(dups);
        System.out.println("Enumeration<String> e = Collections.enumeration(dups), e= ");
        Vector<String> v = new Vector<String>();
        while (e.hasMoreElements()) {
            String s = e.nextElement();
            System.out.println(s);
            v.addElement(s); // 把元素插入 vector
        }

        // Converting an old-style Vector to a List via an Enumeration:
        // 通过一个老式枚举类 把一个老式 Vector 转换为 List
        ArrayList<String> arrayList = Collections.list(v.elements());
        System.out.println("ArrayList<String> arrayList = Collections.list(v.elements()), arrayList: " + arrayList);
    }
}