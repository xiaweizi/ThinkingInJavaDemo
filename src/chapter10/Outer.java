package chapter10;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter10.Outer
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   : 嵌套内部类
 * </pre>
 */
 class Outer {
    int a =2;

    int f () {
        System.out.println("Outer.f");
        return a;
    }

     class Inner {
        Outer outer() {
            System.out.println("outer a = " + a);
            return Outer.this;
        }
    }

     private Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.inner().outer().f();
    }
}
