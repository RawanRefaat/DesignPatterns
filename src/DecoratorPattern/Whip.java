package DecoratorPattern;

public class Whip extends ExtraDecorator {

    private final Drink baseDrink;
    private double price;

    public Whip(Drink baseDrink){
        this.baseDrink = baseDrink;
        price = 1.1;
    }

    public String getDescription(){
        return baseDrink.getDescription() + " Extra Whip";
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
