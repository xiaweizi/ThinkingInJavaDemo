package chapter10;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter10.StaticOuter
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   :
 * </pre>
 */

class StaticOuter {
    int a = 1;

    StaticInner getInner() {
        return new StaticInner();
    }

    static class StaticInner {
        int b = 12;
        void f() {
            System.out.println("static inner f");
            System.out.println("b " + b);
        }
    }

    public static void main(String[] args) {
        new StaticOuter().getInner().f();
    }
}
