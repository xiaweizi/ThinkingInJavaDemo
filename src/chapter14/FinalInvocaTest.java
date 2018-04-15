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
        Field s = Name1.class.getDeclaredField("s");
        age.setAccessible(true);
        age.set(name, 12);
        s.setAccessible(true);
        s.set(name, "b");
        System.out.println(age.get(name));
        System.out.println(name.getAge());
        System.out.println(s.get(name));
        System.out.println(name.getS());

    }
}
class Name1 {
    final int age = 10;
    private final String s = "I'm totally safe";
    public int getAge() {
        return this.age;
    }

    public String getS() {
        return s;
    }
}