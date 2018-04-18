package chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.TextFile
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   : 2. 文本的读写器操作
 * </pre>
 */

public class TextFile {

    private static String fileName = "txt.txt";

    public static String read(String fileName) {

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            try {
                String s;
                while ((s = br.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void write(String fileName, String txt) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName));
            try {
                out.write(txt);
            } finally {
                out.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("dd");
        System.out.println(read(fileName));
        write(fileName, "dagfa");
    }
}
