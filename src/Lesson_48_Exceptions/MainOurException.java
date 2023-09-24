package Lesson_48_Exceptions;

public class MainOurException {

    public static void main(String[] args) {
        try {
            throw  new OurException("This is our error message");
        }catch (OurException e){
            System.out.println(e); //  так как String переопределен - ошибка печатается
                                   // OurException: This is our error message
        }
    }

}
