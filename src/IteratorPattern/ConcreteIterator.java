package IteratorPattern;

public class ConcreteIterator implements Iterator{

    String [] items;
    int currentPosition;

    public ConcreteIterator(String [] items){
        currentPosition = 0;
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(currentPosition >= items.length || items[currentPosition] == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String getNext() {
        String currentItem = items[currentPosition++];
        return currentItem;
    }
}
