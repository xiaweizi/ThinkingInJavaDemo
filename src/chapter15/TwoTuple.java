package chapter15;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter15.TwoTuple
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/11
 *     desc   : 2
 * </pre>
 */

class TwoTuple<A, B> {
    private A a;
    private B b;
    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> twoTuple = new TwoTuple<>("String", 2);
        System.out.println(twoTuple);
    }
}
