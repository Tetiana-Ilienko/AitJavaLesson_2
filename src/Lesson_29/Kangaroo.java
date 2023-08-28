package Lesson_29;

public class Kangaroo implements Movable{

    public Kangaroo() {

    }

    @Override
    public void move() {
        System.out.println("Kangaroo can move.");

    }

    @Override
    public void stop() {
        System.out.println("Kangaroo can stop.");
    }
    public String toString(){
        return "Kangaroo";
    }
}

