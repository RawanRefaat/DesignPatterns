package StrategyPattern;

public interface SwimmingBehavior {

    default void swim() {
        System.out.println("Swimming without a style");
    }
}
