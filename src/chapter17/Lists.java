package chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.Lists
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/16
 *     desc   :
 * </pre>
 */

public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(String collectionName, List<String> a) {
        print("\n// collectionName = " + collectionName + "from basicTest method.");
        a.add(1, "x"); // Add at location 1(即第2个位置)
        a.add("x"); // Add at end
        print("a.add(1, \"x\"), a.add(\"x\"), a = " + a);

        a.addAll(Countries.names(5));
        a.addAll(3, Countries.names(5));
        print("a.addAll(Countries.names(5)), a.addAll(3, Countries.names(5)), a = " + a);

        b = a.contains("1"); // Is it in there?
        print("a.contains(\"1\") = " + b);

        // Is the entire collection in there?
        b = a.containsAll(Countries.names(5));
        print("a.containsAll(Countries.names(5)) = " + b);

        /*  以下操作成本对ArrayList很便宜，对LinkedList很昂贵  */
        s = a.get(1); // 取出 index = 1 处的值
        i = a.indexOf("1"); // Tell index of object
        b = a.isEmpty(); // Any elements inside?
        it = a.iterator(); // Ordinary Iterator
        lit = a.listIterator(); // ListIterator
        lit = a.listIterator(3); // Start at loc 3
        i = a.lastIndexOf("1"); // Last match
        System.out.println("a.get(1) = " + s + ", a.indexOf(\"1\") = " + i
                + ", a.isEmpty() = " + b + ", a.iterator() = " + it + ", "
                + "a.listIterator(3) = " + lit + ", a.lastIndexOf(\"1\") = " + a.lastIndexOf("1"));

        print("a = " + a);
        a.remove(1); // Remove location 1
        a.remove("3"); // Remove this object
        a.remove("tr");
        a.set(1, "y"); // Set location 1 to "y"
        print("a.remove(1), a.remove(\"3\"), a.set(1, \"y\"), a = " + a);

        /* retainAll() 求交集 */
        print("a = " + a);
        a.retainAll(Countries.names(5));
        print("Countries.names(5) = " + Countries.names(5));
        print("a.retainAll(Countries.names(5)), a = " + a);

        // Remove everything that's in the argument:
        a.removeAll(Countries.names(5));
        System.out.println("a.removeAll(Countries.names(5)), a = " + a);
        i = a.size(); // How big is it?
        a.clear(); // Remove all elements

        // mycode
        System.out.println("====== this is my mycode ======");
        a = new ArrayList(Arrays.asList("A B C D E F G".split(" ")));
        List subList = new ArrayList(Arrays.asList("A Z C I".split(" ")));
        print("a = " + a);
        print("subList = " + subList);
        a.retainAll(subList);
        print("a.retainAll(subList), a = " + a);
        print("sublist = " + subList);

        System.out.println("\n====== this is my mycode ======");
        a = new ArrayList(Arrays.asList("A B C D E F G".split(" ")));
        subList = new ArrayList(Arrays.asList("A Z C I".split(" ")));
        print("a = " + a);
        print("subList = " + subList);
        subList.retainAll(a);
        print("after subList.retainAll(a)");
        print("a = " + a);
        print("sublist = " + subList);
        System.out.println("====== this is my mycode ====== \nover");
    }

    /* 双向移动的迭代器 */
    public static void iterMotion(String collectionName, List<String> a) {
        print("\n// collectionName = " + collectionName + ", from iterMotion method");
        print("a = " + a);
        ListIterator<String> it = a.listIterator(); // 双向移动的迭代器
        b = it.hasNext();
        print("it.hasNext() = " + b);
        b = it.hasPrevious();
        print("it.hasPrevious() = " + b);
        s = it.next(); // 先返回值 后 counter++.
        print("it.next() = " + s);

        i = it.nextIndex(); // 返回当值的 counter 大小
        print("it.nextIndex() = " + i);

        s = it.previous();  // --counter 先减 返回值 .
        print("it.previous() = " + s);

        i = it.previousIndex(); // --counter 先减
        print("it.previousIndex() = " + i);
    }
    /* 通过迭代器操作容器元素（增删改查） */
    public static void iterManipulation(String collectionName, List<String> a) {
        print("\n// collectionName = " + collectionName + ", from iterManipulation method");
        ListIterator<String> it = a.listIterator();
        print("a = " + a);
        it.add("47");
        print("it.add(\"47\"), a = " + a);
        it.next(); // 先返回值，后更新游标
        it.remove();// 移除游标的上一个元素，然后更新游标；
        print("ListIterator.next(), ListIterator.remove(), a = " + a);

        // Must move to an element after remove():
        /* remove 操作后，必须调用next() 方法，因为 remove() 把 lastRet 赋值为 -1 */
        it.next();
        // Change the element after the deleted one:
        it.set("47");
        print("a = " + a);
    }

    public static void testVisual(String collectionName, List<String> a) {
        print("\n// collectionName = " + collectionName);
        print(a);
        List<String> b = Countries.names(5);
        print("b = " + b);
        ArrayList list;

        a.addAll(b);
        a.addAll(b);
        print("a.addAll(b) a.addAll(b); a = " + a);
        // Insert, remove, and replace elements
        // using a ListIterator:
        ListIterator<String> x = a.listIterator(a.size() / 2);
        x.add("one");
        print("x.add('one'); a = " + a);
        print(x.next());
        x.remove();
        print(x.next());
        x.set("47");
        print(a);
        // Traverse the list backwards:
        x = a.listIterator(a.size());
        while (x.hasPrevious())
            print(x.previous() + " ");
        print();
        print("====== testVisual finished ======\n");
    }

    // There are some things that only LinkedLists can do:
    public static void testLinkedList(String collectionName) {
        print("\n====== testLinkedList ======");
        LinkedList<String> ll = new LinkedList<String>();
        ll.addAll(Countries.names(5));
        print(ll);

        // Treat it like a stack, pushing:
        ll.addFirst("one");
        ll.addFirst("two");
        print(ll);

        // Like "peeking" at the top of a stack:
        print(ll.getFirst());

        // Like popping a stack:
        print(ll.removeFirst());

        print(ll.removeFirst());

        // Treat it like a queue, pulling elements
        // off the tail end:
        print(ll.removeLast());

        print(ll);

        print("====== testLinkedList over.======\n");
    }

    private static void print(Object x) {
        System.out.println(x);
    }
    private static void print() {
        System.out.println();
    }

    public static void main(String[] args) {
        // Make and fill a new list each time:
        basicTest("basicTest, LinkedList", new LinkedList<String>(Countries.names(5)));
        basicTest("basicTest, ArrayList", new ArrayList<String>(Countries.names(5)));
        iterMotion("iterMotion, LinkedList", new LinkedList<String>(Countries.names(5)));
        iterMotion("iterMotion, ArrayList", new ArrayList<String>(Countries.names(5)));
        iterManipulation("iterManipulation, LinkedList", new LinkedList<String>(Countries.names(5)));
        iterManipulation("iterManipulation, ArrayList", new ArrayList<String>(Countries.names(5)));
        testVisual("testVisual, LinkedList", new LinkedList<String>(Countries.names(5)));
        testLinkedList("testLinkedList");
    }
}
class Countries {
    public static List<String>  names(int num) {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            data.add("data:" + i);
        }
        return data;
    }
}