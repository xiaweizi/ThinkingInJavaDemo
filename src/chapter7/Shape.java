package chapter7;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter7.Shape
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/03
 *     desc   :
 * </pre>
 */

class Shape {

    public static void main(String[] args) {
        CADSystem system = new CADSystem(4);
        try {
            // ..
        } finally {
            system.dispose();
        }
    }

    private int age;

    Shape(int i) {
        System.out.println("Shape construct");
        age = i;
    }

    void dispose() {
        System.out.println("Shape dispose");
    }

    @Override
    public String toString() {
        return "age:" + age;
    }
}

class CADSystem extends Shape {

    private line[] lines = new line[3];
    private Circle circle;
    private Rect rect;
    CADSystem(int i) {
        super(i);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new line(j);
        }
        circle = new Circle(i);
        rect = new Rect(i);
        System.out.println("CADSystem construct");
    }

    @Override
    void dispose() {
        for (line line : lines) {
            line.dispose();
        }
        circle.dispose();
        rect.dispose();
        super.dispose();
    }
}

class line extends Shape {

    line(int i) {
        super(i);
        System.out.println("Line construct " + i);
    }

    @Override
    void dispose() {
        System.out.println("line dispose");
        super.dispose();
    }
}

class Circle extends Shape {

    Circle(int i) {
        super(i);
        System.out.println("Circle construct");
    }

    @Override
    void dispose() {
        System.out.println("Circle dispose");
        super.dispose();
    }
}

class Rect extends Shape {

    Rect(int i) {
        super(i);
        System.out.println("Rect construct");
    }

    @Override
    void dispose() {
        System.out.println("Rect dispose");
        super.dispose();
    }
}