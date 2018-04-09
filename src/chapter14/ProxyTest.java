package chapter14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
        System.out.println();
        System.out.println();
        Interface anInterface = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(new RealObject()));
        consumer(anInterface);
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

class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;
    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("DynamicProxy " + method.getName());
        return method.invoke(proxied, args);
    }
}

