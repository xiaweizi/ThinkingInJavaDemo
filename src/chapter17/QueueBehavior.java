package chapter17;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.QueueBehavior
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/16
 *     desc   :
 * </pre>
 */

public class QueueBehavior {
    private static int count = 10;

    static <T> void test(Queue<T> queue, Generator<T> gen) {
        for (int i = 0; i < count; i++)
            queue.offer(gen.next()); // 插入尾部：offer() == add() 方法
        while (queue.peek() != null) // 不删除头部并返回头部： peek() 当queue为空返回空
            System.out.print(queue.remove() + " "); // 删除头部；
        System.out.println();
    }

    static class Gen implements Generator<String> {
        String[] s = ("one two three four five six seven " + "eight nine ten")
                .split(" ");
        int i;

        public String next() {
            return s[i++];
        }
    }

    public static void main(String[] args) {
        test(new LinkedList<String>(), new Gen()); // 出队顺序与进队顺序一致
        test(new PriorityQueue<String>(), new Gen()); // 不一致
        test(new ArrayBlockingQueue<String>(count), new Gen()); // 出队顺序与进队顺序一致
        test(new ConcurrentLinkedQueue<String>(), new Gen()); // 出队顺序与进队顺序一致
        test(new LinkedBlockingQueue<String>(), new Gen()); // 出队顺序与进队顺序一致
        test(new PriorityBlockingQueue<String>(), new Gen()); // 不一致
    }
}
