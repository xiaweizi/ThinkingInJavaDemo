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
    public final static String desc = "desc";
    public final static int age = 12;
    static {
        System.out.println("age is loading");
    }
    Age() {
        System.out.println("age construct");
    }
}

public class ClassTest {
    public static void main(String[] args) {
//        new Name();
//        try {
//            if (Boolean.TYPE == boolean.class) {
//                System.out.println(true);
//            }
//            Class.forName("chapter14.Sex");
//            Class<Age> ageClass = Age.class;
//            System.out.println(ageClass.getCanonicalName());
//            System.out.println(ageClass.getName());
//            System.out.println(ageClass.getSuperclass());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        new Age();
        System.out.println(Age.age);
    }
}

