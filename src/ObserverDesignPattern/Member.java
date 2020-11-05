package ObserverDesignPattern;

public class Member implements Observer {

    private Subject admin;

    public Member(Subject admin) {
        this.admin = admin;
        admin.registerObserver(this);
    }

    public void update(String coursesAvailable){
        //whatever action I want to execute when there are updates
        System.out.println(coursesAvailable);
    }

}
