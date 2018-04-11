package chapter15;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter15.LinkedStack
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/09
 *     desc   : 1
 * </pre>
 */

class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;
        Node() {
            item = null;
            next = null;
        }
        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();
    void push(T item) {
        top = new Node<>(item, top);
    }

    T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String>  lss = new LinkedStack<>();
        for (String s : "aaa bbb ccc".split(" ")) {
            lss.push(s);
        }
        String temp;
        while ((temp = lss.pop()) != null) {
            System.out.println(temp);
        }
    }
}
