package DecoratorPattern;

public class Americano implements Drink{

    String description;
    double price;

    public Americano(){
        this.description = "Americano Coffee";
        this.price = 1.5;
    }

    public String getDescription(){
        return description;
    }

    public double cost(){
        return price;
    }
}
