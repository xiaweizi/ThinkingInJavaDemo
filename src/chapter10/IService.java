package chapter10;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter10.IService
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/03/08
 *     desc   : 工厂模式的匿名内部类
 * </pre>
 */

interface IService {
    void method1();
    void method2();
}
interface IFactory {
    IService getService();
}

class Service1 implements IService {

    @Override
    public void method1() {
        System.out.println("Service1 method 1");
    }

    @Override
    public void method2() {
        System.out.println("Service1 method 2");
    }

    static IFactory factory = new IFactory() {
        @Override
        public IService getService() {
            return new Service1();
        }
    };
}

class Service2 implements IService {
    @Override
    public void method1() {
        System.out.println("Service2 method 1");
    }

    @Override
    public void method2() {
        System.out.println("Service2 method 2");
    }

    static IFactory factory = new IFactory() {
        @Override
        public IService getService() {
            return new Service2();
        }
    };
}

class Main {

    static void factoryConsumer(IFactory factory) {
        IService service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        factoryConsumer(Service1.factory);
        factoryConsumer(Service2.factory);
    }
}

