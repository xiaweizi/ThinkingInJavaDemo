package chapter3;


/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter3.Main
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/02/24
 *     desc   :
 * </pre>
 */

class Main {

    public static void main(String[] args) {
        System.out.println(2+3);
        System.out.println("2"+3);
        System.out.println(2+"3");
        System.out.println("--------------");

        Student a = new Student();
        Student b = new Student();
        a.name = "a";
        b.name = "b";
        a = b;
        System.out.println("a->" + a + "\tb->" + b);
        b.name = "c";
        System.out.println("a->" + a + "\tb->" + b);
        System.out.println("---------------");

        int aa = 20;
        int bb = 20;
        System.out.println(aa == bb);

        Integer aaa = new Integer(22);
        Integer bbb = new Integer(22);
        System.out.println(aaa == bbb);

        float expFloat = 1.1e-3f;
        System.out.println(expFloat);

        double aDouble = -1.6;
        int anInt = (int) aDouble;
        System.out.println(anInt);

        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 2;
        System.out.println("bigger = " + bigger);
    }
}

class Student {
    String name;

    @Override
    public String toString() {
        return name;
    }
}