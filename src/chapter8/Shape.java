package chapter8;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter8.Shape
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/06
 *     desc   :
 * </pre>
 */

class Animal {
    Animal() {
        System.out.println("Animal");
    }
}

class Car {
    Car() {
        System.out.println("Car");
    }
}

class Water {
    Water() {
        System.out.println("Water");
    }
}

class People extends Animal{
    People() {
        System.out.println("People");
    }
}

class Student extends People {
    Student() {
        System.out.println("Student");
    }

    private Car car = new Car();
    private Water water = new Water();

    public static void main(String[] args) {
        People student = new Student();
    }
}

