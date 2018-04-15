package chapter14;

import java.lang.reflect.Field;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter14.ModifyingPrivateFields
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/15
 *     desc   :
 * </pre>
 */

class WithPrivateFinalField {
    private int i = 1;
    private final String s = "I'm totally safe"; // 常量字符串
    private String s2 = "Am I safe?";


    public String toString() {
        return "private int i = " + i + ", private final String s = " + s + ", private String s2 = " + s2;
    }
}
// 荔枝-通过反射访问和修改私有变量，私有常量的荔枝
public class ModifyingPrivateFields {
    public static void main(String[] args) throws Exception {
        WithPrivateFinalField pf = new WithPrivateFinalField();

        System.out.println(pf + "\n");
        // 通过反射访问私有变量i
        Field f = pf.getClass().getDeclaredField("i");
        f.setAccessible(true); // 设置字段 i 的可访问权限为true
        System.out.println("Field f = pf.getClass().getDeclaredField(\"i\"); f.setAccessible(true); f.getInt(pf) = " + f.getInt(pf));


        // 通过反射更改私有变量i
        f.setInt(pf, 47);
        System.out.println("f.setInt(pf, 47); f.get(pf) = " + f.get(pf));

        // 通过反射访问私有常量s
        f = pf.getClass().getDeclaredField("s");
        f.setAccessible(true); // 设置字段 s 的可访问权限为true
        System.out.println("f = pf.getClass().getDeclaredField(\"s\"); f.setAccessible(true); f.get(pf) 静态常量修改前 = " + f.get(pf));

        // 但通过反射甚至可以修改私有常量(final) s
        System.out.println("-----");
        f.set(pf, "No, you're not1!");
        System.out.println("f.set(pf, \"No, you're not!\");, f.get(pf) 静态常量修改后 = " + f.get(pf));

        // 通过反射访问私有变量s2
        f = pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f = pf.getClass().getDeclaredField(\"s2\"); f.setAccessible(true); f.get(pf) = " + f.get(pf));

        // 通过反射修改私有变量s2
        f.set(pf, "No, you're not!");
        System.out.println("f.set(pf, \"No, you're not!\"); f.get(pf) = " + f.get(pf));

    }
}
