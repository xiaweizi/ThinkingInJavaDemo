package chapter8;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter8.Machine
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/06
 *     desc   :
 * </pre>
 */

class Machine {
    void work() {
        System.out.println("Machine work!");
    }
}

class Computer extends Machine {
    @Override
    void work() {
        System.out.println("Computer work");
    }
}

class Light extends Machine {
    @Override
    void work() {
        System.out.println("Light work");
    }

    public static void main(String[] args) {
        run(new Computer());
        run(new Light());
    }

    private static void run(Machine machine) {
        machine.work();
    }
}
