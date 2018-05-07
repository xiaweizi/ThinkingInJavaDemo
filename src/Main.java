import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Student student1 = new Student();
        student1.name ="00";
        Student student2 = student1;
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println("------");
        student1.name = "11";
        System.out.println(student1.name);
        System.out.println(student2.name);
        student2.name = "22";
        System.out.println(student1.name);
        System.out.println(student2.name);
    }

}

class Student {
    String name;
}
