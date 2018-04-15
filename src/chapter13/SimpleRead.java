package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter13.SimpleRead
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/15
 *     desc   :
 * </pre>
 */

public class SimpleRead {
    public static BufferedReader input = new BufferedReader(new StringReader(
            "Sir Robin of Camelot\n22 1.61803"));

    public static void main(String[] args) {
        try {
            System.out.println("\n1.What is your name?");
            String name = input.readLine();
            System.out.println(name); // Sir Robin of Camelot

            System.out.println("\n2.input: <age> <double>");
            String numbers = input.readLine();
            System.out.println("input.readLine() = " + numbers); // 22 1.61803

            String[] numArray = numbers.split(" ");
            int age = Integer.parseInt(numArray[0]); // 22
            double favorite = Double.parseDouble(numArray[1]); // 1.61803

            System.out.format("Hi %s.\n", name);
            System.out.format("In 5 years you will be %d.\n", age + 5);
            System.out.format("My favorite double is %f.", favorite / 2);
        } catch (IOException e) {
            System.err.println("I/O exception");
        }
    }
}
