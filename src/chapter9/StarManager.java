package chapter9;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter9.StarManager
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/07
 *     desc   :
 * </pre>
 */

class StarManager implements IStar{

    IStar iStar;

    StarManager(IStar iStar) {
        this.iStar = iStar;
    }

    @Override
    public void sing() {
        System.out.println("找人唱歌");
        iStar.sing();
    }

    @Override
    public int money() {
        System.out.println("明星需要收费：" + iStar.money());
        System.out.println("代理费：" + 20);
        return iStar.money() + 10;
    }

    public static void main(String[] args) {
        StarManager manager = new StarManager(new HuangBo());
        manager.sing();
        System.out.println("一共需要花费" + manager.money());
    }
}

interface IStar {
    void sing();
    int money();
}

class HuangBo implements IStar {

    @Override
    public void sing() {
        System.out.println("黄渤 sing");
    }

    @Override
    public int money() {
        return 200;
    }
}
