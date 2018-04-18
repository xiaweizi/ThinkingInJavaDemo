package chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;


/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.DirList
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   : 1 列出相对路径的所有文件
 * </pre>
 */

public class DirList {
    public static void main(String[] args) {
        File path = new File("./src");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println(s);
        }
    }
}

class DirFilter implements FilenameFilter {

    private Pattern pattern;
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
