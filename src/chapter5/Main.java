package chapter5;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter5.Main
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/02
 *     desc   :
 * </pre>
 */

class Main {
    public static void main(String[] args) {
        Student student = new Student(2);
        student.f("x",2, "dfa", 0.2f);

//        Student student = new Student(12);
//        student.fun(1, "aa");
//        student.fun("bb", 2);
//        student.test(1);
//        student.test(12L);
//        student.test(1f);
//        student.test(1d);
//        student.test(1D);
//        student.test(1);

//        Book book = new Book(true);
//        book.checkIn();
        new Book(true);
        System.gc();

        for (Color color : Color.values()) {
            System.out.println(color);
        }

        Color red = Color.RED;
        switch (red) {
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            default:
                break;
        }

    }

    Student student = new Student(1);
    static Student student1 = new Student(2);
}
