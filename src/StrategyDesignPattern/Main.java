package StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {

	    Swimmer person = new Swimmer(new FreestyleStroke());
	    person.executeSwimming();

    }
}
