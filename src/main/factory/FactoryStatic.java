package main.factory;

/**
 * @author zhang
 * @date 2020/8/3
 * 凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * 在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，
 * 大多数情况下，我们会选用第三种——静态工厂方法模式。
 */
interface HumanStatic {
    /**
     * 吃饭
     */
    void eat();

    /**
     * 睡觉
     */
    void sleep();

    /**
     * 打豆豆
     */
    void beat();
}

class FemaleStatic implements HumanStatic {

    @Override
    public void eat() {
        System.out.println("Female eat");
    }

    @Override
    public void sleep() {
        System.out.println("Female sleep");
    }

    @Override
    public void beat() {
        System.out.println("Female beat");
    }
}

class MaleStatic implements HumanStatic {

    @Override
    public void eat() {
        System.out.println("Male eat");
    }

    @Override
    public void sleep() {
        System.out.println("Male sleep");
    }

    @Override
    public void beat() {
        System.out.println("Male beat");
    }
}

class HumanFactoryStatic {
    public static MaleStatic createMale() {
        return new MaleStatic();
    }

    public static FemaleStatic createFemale() {
        return new FemaleStatic();
    }
}
public class FactoryStatic {
    public static void main(String[] args) {
        HumanStatic human=HumanFactoryStatic.createFemale();
        human.beat();
    }
}
