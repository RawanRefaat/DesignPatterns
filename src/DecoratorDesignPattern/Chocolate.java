package DecoratorDesignPattern;

public class Chocolate extends ExtraDecorator{

    private final Drink baseDrink;
    private double price;

    public Chocolate(Drink baseDrink){
        this.baseDrink = baseDrink;
        price = 1.5;
    }

    public String getDescription(){
        return baseDrink.getDescription() + " Extra Chocolate";
    }


    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double cost(){
        return baseDrink.cost()+price;
    }


}
