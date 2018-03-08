package chapter10;


/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter10.AnonyConstruct
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   : 匿名类的构造函数
 * </pre>
 */


abstract class Base {
    Base() {
        System.out.println("Base Construct");
    }
    Base(int i) {
        System.out.println("construct: " + i);
    }
    abstract void f();
}

public class AnonyConstruct {
    public static Base getBase() {
        return new Base() {
            {
                System.out.println("dddd");
            }
            @Override
            void f() {
                System.out.println("Anony f");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase();
        base.f();
    }
}

