package chapter7;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter7.Parent
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/03
 *     desc   :
 * </pre>
 */

class Parent {
    private static int a = getInt();
    protected static int getInt() {
        System.out.println("static method getInt");
        return 2;
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Child extends Parent{
    Child() {
        System.out.println("child construct");
    }
}
