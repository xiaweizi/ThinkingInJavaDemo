package chapter9;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter9.Factories
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/07
 *     desc   :
 * </pre>
 */

class Factories {
    private static void factoryConsumer(CarFactory carFactory) {
        ICar car = carFactory.getCar();
        car.light();
        car.wheel();
    }

    public static void main(String[] args) {
        factoryConsumer(new BaoMaFactory());
        factoryConsumer(new BenChiFactory());
    }
}

interface ICar {
    void wheel();
    void light();
}

interface CarFactory {
    ICar getCar();
}

class BaoMa implements ICar {

    @Override
    public void wheel() {
        System.out.println("BaoMa--wheel");
    }

    @Override
    public void light() {
        System.out.println("BaoMa--light");
    }
}

class BenChi implements ICar {

    @Override
    public void wheel() {
        System.out.println("BenChi--wheel");
    }

    @Override
    public void light() {
        System.out.println("BenChi--light");
    }
}

class BaoMaFactory implements CarFactory {

    @Override
    public ICar getCar() {
        return new BaoMa();
    }
}

class BenChiFactory implements CarFactory {

    @Override
    public ICar getCar() {
        return new BenChi();
    }
}