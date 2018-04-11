package chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter15.GenericTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/11
 *     desc   : 4
 * </pre>
 */

class GenericTest {

    public static void main(String[] args) {
        System.out.println(makeList(1.21, "gfda", 1332, 1.5f));

        Class class1 = new ArrayList<String>().getClass();
        Class class2 = new ArrayList<Integer>().getClass();
        System.out.println(class1 == class2);
        System.out.println(Arrays.toString(class1.getTypeParameters()));

    }

    private static <T>List<T> makeList(T... args) {
        return new ArrayList<>(Arrays.asList(args));
    }
}

interface A {
    void a();
}
interface B {
    void b();
}
class C{
    void c(){

    }
}
class D extends C implements A, B{

    @Override
    public void a() {}

    @Override
    public void b() {}

    @Override
    void c() {}

    void d() {

    }
}
class E<T extends D> {
    private T t;
    void t() {
    }
}
