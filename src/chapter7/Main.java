package chapter7;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter7.Main
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/03
 *     desc   :
 * </pre>
 */

class Main {

    public static void main(String[] args) {
        Worker worker = new Worker("_xia");
    }
}

class People {
    People() {
        System.out.println("People");
    }
    People(String name) {
        System.out.println("People" + name);
    }
}

class Worker extends People{
    Worker() {
        System.out.println("Worker");
    }
    Worker(String name) {
        System.out.println("Worker" + name);
    }
}

class Student extends Worker {
    Student() {
        System.out.println("Student");
    }

    Student(String name) {
        super(name);
        System.out.println("Student" + name);
    }
}
