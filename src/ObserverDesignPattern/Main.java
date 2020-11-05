package ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {

        Admin leader = new Admin();
        Member member = new Member(leader);

        leader.setCourses("CS-AI");
        leader.setCourses("OS");

    }
}