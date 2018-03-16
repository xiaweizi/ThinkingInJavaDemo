package chapter12;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter12.CustomException
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/09
 *     desc   :
 * </pre>
 */

class CustomException {

    static void f() throws MyException {
        System.out.println("1111");
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            System.out.println("2222");
            f();
        } catch (MyException e) {
            System.out.println("3333");
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {

}
