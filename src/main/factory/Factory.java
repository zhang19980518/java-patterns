package main.factory;

/**
 * @author zhang
 * @date 2020/8/3
 * 普通工厂模式
 */

    interface Human {
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
    class Female implements Human{

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

    class Male implements Human{

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

    class HumanFactory{
        public Human createHuman(String gender){
            if ("Male".equals(gender)){
                return new Male();
            }
            if ("Female".equals(gender)){
                return new Female();
            }
            else {
                System.out.println("is error");
                return null;
            }
        }
    }
/**
 * @author Joert
 */
public class Factory {
    public static void main(String[] args) {
        HumanFactory humanFactory=new HumanFactory();
        Human male=humanFactory.createHuman("Male");
        male.beat();
        male.eat();
    }
}
