package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        Drink firstOrder = new Americano();
        firstOrder = new Chocolate(firstOrder);
        firstOrder = new Caramel(firstOrder);
        firstOrder = new Whip(firstOrder);

        System.out.println("The drink is:"+ firstOrder.getDescription());
        System.out.println("The total price= "+ firstOrder.cost());

    }
}
