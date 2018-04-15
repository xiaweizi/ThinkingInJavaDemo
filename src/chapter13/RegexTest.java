package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter13.RegexTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/15
 *     desc   :
 * </pre>
 */

class RegexTest {
    public static void main(String[] args) {
        for (String pattern : new String[]
                { "\\S{2,8}", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*" })
            System.out.println("Rudolph".matches(pattern)); // 全为 true, 全匹配.

        Pattern compile = Pattern.compile("[\\w]?");
        Matcher s = compile.matcher("s9090");
        System.out.println(s.matches());
        System.out.println(s.lookingAt());
        while (s.find()) {
            System.out.println(s.group());
            System.out.println(s.start());
            System.out.println(s.end());
            System.out.println("-------");
        }
    }
}
