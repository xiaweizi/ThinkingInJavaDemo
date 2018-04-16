package chapter17;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.CountingMapData
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/16
 *     desc   : 4
 * </pre>
 */

public class CountingMapData extends AbstractMap<Integer, String> {
    private int size;
    private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
    public CountingMapData(int size) {
        if (size < 0)
            this.size = 0;
        this.size = size;
    }
    private static class Entry implements Map.Entry<Integer, String> {// 静态内部类
        int index;
        Entry(int index) {
            this.index = index;
        }

        public boolean equals(Object o) {
            return Integer.valueOf(index).equals(o);
        }

        public Integer getKey() {
            return index;
        }

        public String getValue() {
            return chars[index % chars.length]
                    + Integer.toString(index / chars.length);
        }

        public String setValue(String value) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            return Integer.valueOf(index).hashCode();
        }
    }

    public Set<Map.Entry<Integer, String>> entrySet() {
        // LinkedHashSet retains initialization order:
        // LinkedHashSet 保持了初始化顺序。
        Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<>();
        for (int i = 0; i < size; i++)
            entries.add(new Entry(i));
        return entries;
    }

    public static void main(String[] args) {
        /*AbstractMap的toString() 方法调用了 entrySet().iterator() 迭代器*/
        /* iteraotr迭代器  调用了 entry.getKey() 和 entry.getValue() 方法 */
        CountingMapData countingMapData = new CountingMapData(3);
        System.out.println(countingMapData);
        Set<Map.Entry<Integer, String>> entries = countingMapData.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getValue());
        }
        System.out.println(entries);
    }
}
