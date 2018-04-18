package chapter18;

import java.io.PrintWriter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.ChangeSystemOut
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("gdaa");

    }
}
