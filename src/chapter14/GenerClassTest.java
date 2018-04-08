package chapter14;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter14.GenerClassTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/08
 *     desc   :
 * </pre>
 */

class GenerClassTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<? extends Number> intClass = int.class;
        intClass = Integer.class;
        intClass = double.class;
        System.out.println(intClass.toString());

        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        People people = studentClass.newInstance();

        Class<? extends People> peopleClass = Student.class;
        peopleClass.newInstance().onPeople();

        Worker<? extends People> worker = new Worker<>(new People());
        worker.test();
    }
}

class Worker<T extends People> {
    T t;
    Worker(T t) {
      this.t = t;
    }
    void test() {
        t.onPeople();
    }
}

class Student extends People{
    void onStudent() {

    }
}

class People {
    void onPeople(){
        System.out.println("simpleName:" + getClass().getSimpleName());
    }
}