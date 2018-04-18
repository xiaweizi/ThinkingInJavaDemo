package chapter18;

import java.io.IOException;
import java.io.StringReader;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.MemoryInput
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader sr = new StringReader("Hello");
        int c;
        while ((c = sr.read()) != -1) {
            System.out.println(String.valueOf(c));
        }
    }
}
