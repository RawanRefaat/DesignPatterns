package FactoryPattern;

public class ItalianPizzaFactory extends PizzaFactory{


    public Pizza createPizza(String topping){
        if(topping.equalsIgnoreCase("Cheese")){
            return new ItalianCheesePizza();
        }
        else if(topping.equalsIgnoreCase("Meat")){
            return new ItalianMeatPizza();
        }
        else return null;
    }
}
