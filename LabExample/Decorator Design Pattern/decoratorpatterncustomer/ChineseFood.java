package decoratorpatterncustomer;

public class ChineseFood extends FoodDecorator{
    public ChineseFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+" With Fired Rice and Manchurian";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+75.0;
    }
}
