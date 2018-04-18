package chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.FileOutputShortCut
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class FileOutputShortCut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader("Hello world!"));
        PrintWriter pw = new PrintWriter(new File("txt.txt"));
        int lineCount = 1;
        String s;
        while ((s = br.readLine()) != null) {
            pw.println(lineCount ++ + ":" + s);
        }
        pw.close();
        br.close();
    }
}
