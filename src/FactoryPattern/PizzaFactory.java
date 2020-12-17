package FactoryPattern;

public abstract class PizzaFactory {

    String description;
    Pizza pizza;

    public Pizza orderPizza(String toppings){
        pizza = createPizza(toppings);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String toppings);
}
