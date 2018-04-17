package chapter17;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.SlowMap
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/17
 *     desc   :
 * </pre>
 */

public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    public V put(K key, V value) {
        V oldValue = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }

    public V get(Object key) {
       if (!keys.contains(key)) {
           return null;
       }
       return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set= new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext()) {
            set.add(new MapEntry<K, V>(ki.next(), vi.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> slowMap = new SlowMap<>();
        slowMap.put("aa", "11");
        slowMap.put("bb", "22");
        slowMap.put("cc", "33");
        System.out.println(slowMap.put("dd", "44"));
        System.out.println(slowMap.get("dd"));
        Set<Entry<String, String>> set = slowMap.entrySet();
        System.out.println(set);
    }
}
