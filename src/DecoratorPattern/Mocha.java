package DecoratorPattern;

public class Mocha implements Drink{

    String description;
    double price;

    public Mocha(){
        this.description = "Mocha Coffee";
        this.price = 5.2;
    }

    public String getDescription(){
        return description;
    }

    public double cost(){
        return price;
    }
}
