package chapter1;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : PACKAGE_NAME.chapter1.Main
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/02/24
 *     desc   :
 * </pre>
 */

/**
 * @see Student
 * {@link Student#name}
 */
class Main {

    public static void main(String[] args) {
        Student student  = new Student();
        student.name = "Hello world!";
        testDoc(student);
        System.out.println(student.name);
        System.out.println("-----------------");
        String value = "Hello world!";
        testDoc(value);
        System.out.println(value);
    }

     static void testDoc(Student student) {
        Student student1 = new Student();
        student.name = "test";
        student = student1;
    }

     static void testDoc(String value) {
        value = "world";
    }
}

class Student  {
    public String name = "hello";
}
