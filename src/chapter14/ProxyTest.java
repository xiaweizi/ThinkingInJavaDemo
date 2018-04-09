package chapter14;

import java.lang.reflect.InvocationTargetException;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter14.ProxyTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/09
 *     desc   : 3
 * </pre>
 */

class ProxyTest {

    private static void consumer(Interface anInterface) {
        anInterface.doSomeThing();
        anInterface.doSomeThingElse("biu~");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println();
        System.out.println();
        consumer(new ProxyObject(new RealObject()));
    }
}

interface Interface {
    void doSomeThing();
    void doSomeThingElse(String args);
}

class RealObject implements Interface {

    @Override
    public void doSomeThing() {
        System.out.println("doSomeThing");
    }

    @Override
    public void doSomeThingElse(String args) {
        System.out.println("doSomeThingElse:" + args);
    }
}

class ProxyObject implements Interface {

    private Interface anInterface;

    ProxyObject(Interface anInterface) {
        this.anInterface = anInterface;
    }

    @Override
    public void doSomeThing() {
        System.out.println("ProxyObject doSomeThing");
        anInterface.doSomeThing();
    }

    @Override
    public void doSomeThingElse(String args) {
        System.out.println("ProxyObject doSomeThingElse:" + args);
        anInterface.doSomeThingElse(args);
    }
}

