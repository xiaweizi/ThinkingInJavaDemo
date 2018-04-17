package chapter17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.TypesForSets
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/17
 *     desc   :
 * </pre>
 */

class SetType {
    int i;

    public SetType(int n) {
        i = n;
    }
    /* 重写 equals 方法 */
    @Override
    public boolean equals(Object o) {
        return o instanceof SetType && (i == ((SetType) o).i);
    }

    public String toString() {
        return Integer.toString(i);
    }
}
/* 存入 HashSet的元素 */
class HashType extends SetType {
    public HashType(int n) {
        super(n);
    }
    /* 重写 hashCode 方法 */
    public int hashCode() {
        return i;
    }
}
/* 存入 TreeSet的元素， 实现 Comparable 接口 */
class TreeType extends SetType implements Comparable<TreeType> {
    public TreeType(int n) {
        super(n);
    }
    @Override
    public int compareTo(TreeType arg) {
        return (arg.i < i ? -1 : (arg.i == i ? 0 : 1));
    }
}

public class TypesForSets {
    static <T> Set<T> fill(Set<T> set, Class<T> type) {
        try {
            for (int i = 0; i < 10; i++)
                set.add(type.getConstructor(int.class).newInstance(i));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return set;
    }

    static <T> void test(Set<T> set, Class<T> type) {
        fill(set, type);
        fill(set, type); // Try to add duplicates, 不重复的。
        fill(set, type);
        System.out.println(set);
    }

    public static void main(String[] args) {
        test(new HashSet<HashType>(), HashType.class); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] // 无序

        test(new LinkedHashSet<HashType>(), HashType.class); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]， 输出顺序和插入顺序同

        test(new TreeSet<TreeType>(), TreeType.class); // [9, 8, 7, 6, 5, 4, 3, 2, 1, 0], 按照排序规则，有序
        System.out.println("\n======\n");

        // Things that don't work: Set 存储不重复元素不起作用了（凡是使用到 hash散列机制的容器，必须重写该容器中存储元素的 hashCode 方法，否则容器的存储规则不奏效）
        test(new HashSet<SetType>(), SetType.class); // HashSet 添加 SetType元素，而SetType 没有重写 hashCode() 方法
        test(new HashSet<TreeType>(), TreeType.class); // HashSet 添加 TreeType元素，而TreeType 没有重写 hashCode() 方法
        test(new LinkedHashSet<SetType>(), SetType.class); // LinkedHashSet 添加 SetType元素，而SetType 没有重写 hashCode() 方法
        test(new LinkedHashSet<TreeType>(), TreeType.class); // LinkedHashSet 添加 TreeType元素，而TreeType 没有重写 hashCode() 方法
        System.out.println("\n======\n");

        try {
            test(new TreeSet<SetType>(), SetType.class); // SetType 没有实现 Comparable接口，不是Comparable子类，所以插入TreeSet失败并抛出异常；
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            test(new TreeSet<HashType>(), HashType.class); // HashType 没有实现 Comparable接口，不是Comparable子类，所以插入TreeSet失败并抛出异常；
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}