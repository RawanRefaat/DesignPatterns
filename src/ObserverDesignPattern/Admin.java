package ObserverDesignPattern;

import java.util.ArrayList;

public class Admin implements Subject {

    private final ArrayList<Observer> observers = new ArrayList<>();
    private String courses;

    public Admin(){
        courses = null;
    }

    public void setCourses(String courses){
        this.courses = courses;
        coursesChanged();
    }

    public void registerObserver(Observer subscriber){
        observers.add(subscriber);
    }

    public void removeObserver(Observer subscriber){
        observers.remove(subscriber);
    }

    public void notifyAllObservers(){
        for (Object observer : observers) {
            Observer subscriber = (Observer) observer;
            subscriber.update(courses);
        }
    }

    public void coursesChanged(){
        notifyAllObservers();
    }

}
