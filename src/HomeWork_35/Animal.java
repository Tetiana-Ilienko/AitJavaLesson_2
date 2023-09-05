package HomeWork_35;


import java.util.Comparator;

public class Animal {

    private String name;
    private int weight; // правильнее double, так как вес не всегда целая
    private String color;
    private  int id;
    static private int counter =1;

    public Animal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }




    @Override
    public String toString() {
        return "Animal_" + id + " {" +  "name= " + name + ", weight= " + weight +
                ", color= " + color +"}";
    }





}
