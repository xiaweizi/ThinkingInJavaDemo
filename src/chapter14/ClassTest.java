package chapter14;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter14.ClassTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/08
 *     desc   : 1
 * </pre>
 */


class Name {
    static {
        System.out.println("name is loading");
    }
}

class Sex {
    static {
        System.out.println("sex is loading");
    }
}

class Age {
    static {
        System.out.println("age is loading");
    }
}

public class ClassTest {

    public static void main(String[] args) {
        new Name();
        try {
            if (Boolean.TYPE == boolean.class) {
                System.out.println(true);
            }
            Class.forName("chapter14.Sex");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Age();
    }
}

