package Proect_Lesson_26;

public class Salami extends Pizza{
     private static String TYPE = "Pizza Salami";

     public Salami() {
          super(TYPE);

     }

     @Override
     protected void prepare() {
          System.out.println("Preparing pizza with salami and tomatoes");

     }
}
