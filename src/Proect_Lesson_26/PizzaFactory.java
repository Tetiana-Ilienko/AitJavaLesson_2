package Proect_Lesson_26;

public class PizzaFactory {

    public  Pizza createPizza(String type){

        switch (type){
            case "1": return  new Salami();
            case "2": return  new Mozarella();
            case "3": return  new Hawaii();
            default: return null;
        }
    }
}
