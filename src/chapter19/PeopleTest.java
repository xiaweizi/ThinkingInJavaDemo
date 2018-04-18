package chapter19;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter19.PeopleTest
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class PeopleTest {
    public static void main(String[] args) {
        for (People people : People.values()) {
            System.out.println(people);
        }
    }
}

enum People {
    MAN("man"), FELMAN("felman"), UNKNOW("unknown");
    String name;
    People(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
