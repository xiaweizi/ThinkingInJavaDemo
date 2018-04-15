package chapter13;

import java.util.Scanner;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter13.BetterRead
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/15
 *     desc   :
 * </pre>
 */

public class BetterRead {
    public static void main(String[] args) {
        // Scanner 可以接受任何类型的 Readable 输入对象
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What is your name?");
        // 所有的输入，分词以及翻译的操作都隐藏在不同类型的 next 方法 中.
        String name = stdin.nextLine(); // nextLine() 返回 String
        System.out.println(name);

        System.out.println("How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>)");

        // Scanner 直接读入 integer 和 double 类型数据
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);

        System.out.format("Hi %s.\n", name);
        System.out.format("In 5 years you will be %d.\n", age + 5);
        System.out.format("My favorite double is %f.", favorite / 2);
    }
}