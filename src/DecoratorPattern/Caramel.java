package DecoratorPattern;

public class Caramel extends ExtraDecorator{

    private final Drink baseDrink;
    private double price;

    public Caramel(Drink baseDrink){
        this.baseDrink = baseDrink;
        price = 2;
    }

    public String getDescription(){
        return baseDrink.getDescription() + " Extra Caramel";
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
