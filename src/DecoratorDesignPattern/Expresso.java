package DecoratorDesignPattern;

public class Expresso implements Drink {

    String description;
    double price;

    public Expresso(){
        this.description = "Expresso Coffee";
        this.price = 1;
    }

    public String getDescription(){
        return description;
    }

    public double cost(){
        return price;
    }

}
