package chapter8;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter8.Phone
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/06
 *     desc   :
 * </pre>
 */

class Phone {

    Phone() {
        System.out.println("before call");
        call();
        System.out.println("after call");
    }

    void call() {
        System.out.println("Phone Call");
    }
}

class IPhone extends Phone {
    private String num = "110";
    IPhone(String num) {
        this.num = num;
        System.out.println("number: " + this.num);
    }

    @Override
    void call() {
        System.out.println("call number: " + num);
    }

    public static void main(String[] args) {
        IPhone iPhone = new IPhone("119");
    }
}
