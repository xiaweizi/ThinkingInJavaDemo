package chapter18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.BufferedInputFileTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class BufferedInputFileTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("txt.txt"));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = br.readLine()) != null) {
            sb.append(s).append("\n");
        }
        br.close();
        System.out.println(sb.toString());

        BufferedWriter bw = new BufferedWriter(new FileWriter("txt.txt"));
        bw.write("hello!!");
        bw.close();
    }
}
