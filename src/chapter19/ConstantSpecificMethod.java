package chapter19;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter19.ConstantSpecificMethod
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public enum ConstantSpecificMethod {
RRR {
    @Override
    String getInfo() {
        return "aa";
    }
};
    public static void main(String... args) {
        for (ConstantSpecificMethod csm : values()) {
            System.out.println(csm.getInfo());
        }
    }
    abstract String getInfo();
}

abstract class fian {
    abstract String getInfo();
}