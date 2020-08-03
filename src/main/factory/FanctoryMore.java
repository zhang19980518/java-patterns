package main.factory;

/**
 * @author zhang
 * @date 2020/8/3
 * 多个工厂方法模式
 */


interface HumanMore {
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

class FemaleMore implements HumanMore {

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

class MaleMore implements HumanMore {

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

class HumanFactoryMore {
    public MaleMore createMale() {
        return new MaleMore();
    }

    public FemaleMore createFemale() {
        return new FemaleMore();
    }
}

public class FanctoryMore {
    public static void main(String[] args) {

        HumanFactoryMore humanFactoryMore = new HumanFactoryMore();
        HumanMore humanMore = humanFactoryMore.createFemale();
        humanMore.beat();
    }
}
