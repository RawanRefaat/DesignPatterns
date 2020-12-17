package IteratorPattern;

public class ConcreteCollection implements Collection{

    String [] menueItems;

    public ConcreteCollection(String [] menueItems){
        this.menueItems = menueItems;
    }

    public Iterator getIterator(){

        return new ConcreteIterator(menueItems);

    }
}
