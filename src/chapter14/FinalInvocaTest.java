package chapter14;

import java.lang.reflect.Field;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter14.FinalInvocaTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/09
 *     desc   : 4
 * </pre>
 */

class FinalInvocaTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        Name1 name = Name1.class.newInstance();
        Field age = Name1.class.getDeclaredField("age");
        age.set(name, 12);
        System.out.println(name.getAge());
    }
}
class Name1 {
    final int age = 10;

    public int getAge() {
        return this.age;
    }
}