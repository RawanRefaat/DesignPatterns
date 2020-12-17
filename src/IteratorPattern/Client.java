package IteratorPattern;

public class Client {
    public static void main(String []args){

        String [] menueItems = {"First Item","Second Item","Third Item","Fourth Item","Fifth Item"};
        ConcreteCollection firstMenue = new ConcreteCollection(menueItems);
        Iterator menueIterator = firstMenue.getIterator();
        while (menueIterator.hasNext()){
            System.out.println(menueIterator.getNext());
        }


    }

}
