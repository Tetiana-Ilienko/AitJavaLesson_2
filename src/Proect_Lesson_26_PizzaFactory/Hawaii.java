package Proect_Lesson_26_PizzaFactory;

public class Hawaii extends Pizza {
    private static String TYPE = "Pizza Hawaii";

    public Hawaii(){
        super(TYPE);
    }


    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with ananas and cheese");

    }
}
