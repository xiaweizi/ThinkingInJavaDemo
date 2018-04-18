package chapter18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.FormattedMemoryInput
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream("hello".getBytes()));
        System.out.println((char) dis.readByte());
        System.out.println((char) dis.readByte());
        System.out.println(dis.available());
    }
}
