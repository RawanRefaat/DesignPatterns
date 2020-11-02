package StrategyDesignPattern;

public class Swimmer {

    private final SwimmingBehavior swimmingStrategy;

    public Swimmer(SwimmingBehavior strategy){
        this.swimmingStrategy = strategy;
    }

    public void executeSwimming(){
        swimmingStrategy.swim();
    }
}
