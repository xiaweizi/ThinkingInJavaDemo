package chapter10;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter10.Contents
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   :
 * </pre>
 */

class Contents {

    Contents contents() {
        return new Contents() {
          int i = 0;
          int getValue() {
              System.out.println("匿名内部类的方法");
              return i;
          }
        };
    }

    public static void main(String[] args) {
        Contents contents = new Contents();
        Contents contents1 = contents.contents();
    }
}
