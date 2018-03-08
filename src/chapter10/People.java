package chapter10;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter10.People
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   : 方法内部嵌套类
 * </pre>
 */

class People {

    interface IWork {
        void work();
    }

    IWork teach(final String content) {

        class Student implements IWork{

            @Override
            public void work() {
                System.out.println("content:" + content);
            }
        }
        return new Student();
    }

    public static void main(String[] args) {
        People people = new People();
        people.teach("English").work();
    }
}
