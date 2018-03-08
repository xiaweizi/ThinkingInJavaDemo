package chapter11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter11.LinkedListTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   :
 * </pre>
 */

class LinkedListTest {
    public static void main(String[] args) {
        Queue<Integer> data = new LinkedList<Integer>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        System.out.println(data.element());
        // 加入到队列中
        System.out.println(data.offer(2));
        System.out.println(data);
        System.out.println("队列的首部");
        System.out.println(data.peek());
        System.out.println(data);
        // 去除队列的首部
        System.out.println(data.poll());
        System.out.println(data);

//        System.out.println(data.getFirst());
//        System.out.println(data.element());
//        System.out.println(data.peek());
//        System.out.println(data.remove());
//        System.out.println(data.removeFirst());
//        System.out.println(data.poll());
//        data.addFirst(11);
//        System.out.println(data);
//        data.offer(23);
//        System.out.println(data);
//        data.push(99);
//        data.pop();
//        System.out.println(data);
    }
}
