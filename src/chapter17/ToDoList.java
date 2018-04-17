package chapter17;

import java.util.PriorityQueue;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.ToDoList
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/17
 *     desc   :
 * </pre>
 */

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem> { // 静态内部类
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(char pri, int sec, String item) {
            primary = pri;
            secondary = sec;
            this.item = item;
        }
        /* 优先级计算规则 */
        public int compareTo(ToDoItem arg) {
            if (primary > arg.primary)
                return +1;
            if (primary == arg.primary)
                if (secondary > arg.secondary)
                    return +1;
                else if (secondary == arg.secondary)
                    return 0;
            return -1;
        }

        public String toString() {
            return Character.toString(primary) + secondary + ": " + item + "; ";
        }
    }

    public void add(String item, char pri, int sec) {
        super.add(new ToDoItem(pri, sec, item));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.add("A4", 'C', 4);
        toDoList.add("A2", 'A', 2);
        toDoList.add("B7", 'B', 7);
        toDoList.add("C3", 'C', 3);
        toDoList.add("A1", 'A', 1);
        toDoList.add("B1", 'B', 1);
        while (!toDoList.isEmpty())
            System.out.print(toDoList.remove() + " ");
    }
}