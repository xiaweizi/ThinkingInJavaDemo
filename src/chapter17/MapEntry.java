package chapter17;

import java.util.Map;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.MapEntry
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/17
 *     desc   :
 * </pre>
 */

class MapEntry<K, V> implements Map.Entry<K, V> {

    private K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V v) {
        V result = value;
        value = v;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MapEntry))
            return false;
        MapEntry me = (MapEntry) o;
        return (key == null ? me.getKey() == null : key.equals(me.getKey()))
                && (value == null ? me.getValue() == null : value.equals(me
                .getValue()));
    }

    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
