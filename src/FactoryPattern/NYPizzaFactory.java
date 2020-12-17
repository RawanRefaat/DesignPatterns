package FactoryPattern;

public class NYPizzaFactory extends PizzaFactory{

    public NYPizzaFactory(){
        description = "New York Pizza Style";
    }

    public Pizza createPizza(String topping){
        if(topping.equalsIgnoreCase("Cheese")){
            return new NYCheesePizza();
        }
        else if (topping.equalsIgnoreCase("Meat")){
            return new NYMeatPizza();
        }
        else return null;
    }
}
