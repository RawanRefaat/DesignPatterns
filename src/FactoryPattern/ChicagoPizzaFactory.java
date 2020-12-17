package FactoryPattern;

public class ChicagoPizzaFactory extends PizzaFactory {

    public ChicagoPizzaFactory(){
        description = "Chicago Pizza Style";
    }

    public Pizza createPizza(String topping){
        if(topping.equalsIgnoreCase("Cheese")){
            return new ChicagoCheesePizza();
        }
        else if(topping.equalsIgnoreCase("Meat")){
            return new ChicagoMeatPizza();
        }
        else return null;
    }
}
