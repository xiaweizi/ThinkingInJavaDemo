package chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter17.FillingLists
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/16
 *     desc   : 1
 * </pre>
 */

public class FillingLists {
    public static void main(String[] args) {
        StringAddress hello = new StringAddress("hello");
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, hello));
        System.out.println(list);
        Collections.fill(list, new StringAddress("World"));
        System.out.println(list);
    }
}
class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    public String toString() {
        return super.toString() + " " + s;
    }
}