package chapter19;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter19.SpaceShip
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class SpaceShip {
    public static void main(String[] args) {
        for (Space space : Space.values()) {
            System.out.println(space);
        }
    }
}

enum Space {

    SOCUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }
}
