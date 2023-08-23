package Lesson_26;

public abstract class Animal { // абстрактные методы могут присутствовать только в абстрактных классах

    public abstract void sound(); // абстрактный метод - это метод без тела

    public void move(){//  не абстрактные методы могут присутствовать в абстрактных классах
        System.out.println("Every animal can move");
    }
}


