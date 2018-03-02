package chapter5;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter5.Student
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/02
 *     desc   :
 * </pre>
 */

class Student {
    public Student() {

    }

    Book book = new Book(3);
    static  Book book1 = new Book(4);

    public Student(int age) {
        System.out.println("student init age:" + age);
    }

    public void fun(int age, String name) {
        System.out.println("age:" + age + "\n name:" + name);
    }

    public void fun(String name, int age) {
        System.out.println("name:" + name + "\n age:" + age);
    }

    public void test(char c) {
        System.out.println("char");
    }

    public void test(byte c) {
        System.out.println("byte");
    }
    public void test(short c) {
        System.out.println("short");
    }
    public void test(long c) {
        System.out.println("long");
    }
    public void test(float c) {
        System.out.println("float");
    }
    public void test(double c) {
        System.out.println("double");
    }
}
