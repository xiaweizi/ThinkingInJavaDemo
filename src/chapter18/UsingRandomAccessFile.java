package chapter18;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.UsingRandomAccessFile
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class UsingRandomAccessFile {

    private static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(new File("txt.txt"), "rw");
        for (int i = 0; i < 10; i++) {
            System.out.println("value " + i + "： " + rf.readDouble());
        }
        System.out.println(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(new File("txt.txt"), "rw");
        for (int i = 0; i < 10; i++) {
            rf.writeDouble(i * 1.141f);
        }
        rf.writeUTF("The end of the file");
        display();
        rf.seek(5 * 8);
        rf.writeDouble(44.44f);
        display();
        rf.close();
    }
}
