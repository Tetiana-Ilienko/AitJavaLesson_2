package Lesson_48_Exceptions;

public class OurException extends Exception{
    /*
    Для создания соих исключений, нужно создать свой клас, который наследует класс Exception
     */

    String string;

    public OurException(String string){ //  конструктор
        this.string=string;
    }

    public String toString(){ // переопределяем метод стринг
        return "OurException: " + string;
    }

}
