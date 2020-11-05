package ObserverDesignPattern;


public interface Subject {

    void registerObserver(Observer subscriber);
    void removeObserver(Observer subscriber);
    void notifyAllObservers();

}
