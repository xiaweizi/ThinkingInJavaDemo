package chapter14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter14.AnonymousTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/09
 *     desc   :
 * </pre>
 */

class AnonymousTest {
    static A makeA() {
        return new A() {
            @Override
            public void a() {
                System.out.println("aaaa");
            }

            @Override
            public void b() {
                System.out.println("bbbb");
            }

            @Override
            public void c() {
                System.out.println("cccc");
            }

            @Override
            public void d() {
                System.out.println("dddd");
            }
        };
    }

    private static void callHideMethod(String className, String methodName) {
        try {
            Class<?> aClass = Class.forName(className);
            Method method = aClass.getMethod(methodName);
            Object instance = aClass.newInstance();
            method.invoke(instance);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        A a = AnonymousTest.makeA();
        a.a();
        System.out.println();
        String name = a.getClass().getName();
        callHideMethod(name, "b");
        callHideMethod(name, "c");
        callHideMethod(name, "d");
    }
}

interface A {
    void a();
    void b();
    void c();
    void d();
}