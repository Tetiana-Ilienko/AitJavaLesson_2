package Proect_Lesson_26;

public class Mozarella extends Pizza{
    private static String TYPE = "Pizza Mozarella"; // объявляем константу

    public Mozarella(){
        super(TYPE);
    }


    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with mozarella cheese");
    }
}
