package main.abstrctfactory;

/**
 * @author zhang
 * @date 2020/8/4
 * 抽象工厂模式
 * 抽象工厂模式特别适合于这样的一种产品结构：
 * 产品分为几个系列，在每个系列中，产品的布局都是类似的，在一个系列中某个位置的产品，在另一个系列中一定有一个对应的产品。
 * 这样的产品结构是存在的，这几个系列中同一位置的产品可能是互斥的，它们是针对不同客户的解决方案，每个客户都只选择其一。
 */

/**
 * 抽象食物
 */
interface Food {
    /**
     * 获得食物名称
     *
     * @return
     */
    String getFoodName();
}

/**
 * 抽象餐具
 */
interface TableWare {
    /**
     * 获得餐具名称
     *
     * @return
     */
    String getToolName();
}

/**
 * 抽象工厂
 */
interface KitchenFactory {
    /**
     * 获得食物
     *
     * @return
     */
    public Food getFood();

    /**
     * 获得餐具
     *
     * @return
     */
    public TableWare getTableWare();
}

/**
 * 具体食物
 */
class Apple implements Food{

    @Override
    public String getFoodName() {
        return "apple";
    }
}

/**
 * 具体餐具
 */
class Knife implements TableWare{

    @Override
    public String getToolName() {
        return "knife";
    }
}

/**
 * 具体工厂
 */
class AKitchen implements KitchenFactory{


    @Override
    public Food getFood() {
        return new Apple();
    }

    @Override
    public TableWare getTableWare() {
        return new Knife();
    }
}

public class Foodaholic {

    public void eat(KitchenFactory k){
        System.out.println("A foodaholic is eating "+ k.getFood().getFoodName()
                + " with " + k.getTableWare().getToolName() );
    }

    public static void main(String[] args) {
        Foodaholic fh = new Foodaholic();
        KitchenFactory kf = new AKitchen();
        fh.eat(kf);
    }
}
