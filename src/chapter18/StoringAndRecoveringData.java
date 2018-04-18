package chapter18;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.StoringAndRecoveringData
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("txt.txt"));
        dos.writeDouble(3.154f);
        dos.writeUTF("Hello world1");
        dos.writeUTF("Hello world1");
        dos.close();
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("txt.txt")));
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        System.out.println(dis.readUTF());
    }
}
