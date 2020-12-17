package DecoratorPattern;

public class Latte implements Drink{

    String description;
    double price;

    public Latte(){
        this.description = "Latte Coffee";
        this.price = 4.2;
    }

    public String getDescription(){
        return description;
    }

    public double cost(){
        return price;
    }
}
