package chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter15.RandomList
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/11
 *     desc   :
 * </pre>
 */

class RandomList<T> {
    private List<T> data = new ArrayList<>();
    private Random random = new Random();
    public void add(T t) {
        data.add(t);
    }
    public T select() {
        return data.get(random.nextInt(data.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        randomList.add("12");
        randomList.add("13");
        randomList.add("14");
        randomList.add("15");

        for (int i = 0; i < 10; i++) {
            System.out.println(randomList.select());
        }
    }
}
