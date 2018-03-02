package chapter5;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter5.Book
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/02
 *     desc   :
 * </pre>
 */

class Book {
    private boolean checkOut = false;
    Book(boolean checkOut) {
        this.checkOut = checkOut;
    }

    Book(int a) {
        System.out.println("book init " + a);
    }
    void checkIn() {
        checkOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("book finalize");
        if (checkOut) {
            System.out.println("ERROR: checkedOut");
        }
        super.finalize();
    }
}
