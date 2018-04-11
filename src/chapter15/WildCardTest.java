package chapter15;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter15.WildCardTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/11
 *     desc   : 通配符测试
 * </pre>
 */

class WildCardTest {
    public static void main(String[] args) {

    }
}

class Stack<T> {
    private int index = 0;
    private Object[] storge;

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storge[--index];
    }
}

interface Payable<T>{
    T get();
}
class Employee implements Payable<Employee> {

    @Override
    public Employee get() {
        return null;
    }
}

class Hourly extends Employee implements Payable<Employee> {

}
