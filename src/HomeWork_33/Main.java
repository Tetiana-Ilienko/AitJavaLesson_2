package HomeWork_33;

import java.util.Arrays;

public class Main {
    /*
    Создать класс Animal c полями name, weight, color.
    Используя компараторы вывести на экран список животных, упорядоченный по:
    1. имени
    2. по весу
    3. список имен животных, упорядоченный по возрастанию последней буквы имени

    Wolf, Bear, Fox, Elephant, Anaconda

    для 1 пункта:
    name Anaconda , weight 500, color yellow
    ---------
    -------

    для 3 пункта:
    Anakonda
    Wolf
    Bear
    Elephant
    Fox

    Протестировать правильность работы компараторов
     */
    public static void main(String[] args) {

        Animal animal1 = new Animal("Wolf", 60, "weight");
        Animal animal2 = new Animal("Bear", 150, "braun");
        Animal animal3 = new Animal("Fox", 45, "orange");
        Animal animal4 = new Animal("Elephant", 700, "grey");
        Animal animal5 = new Animal("Anaconda", 100, "yellow");

        Animal[] animals = {animal1, animal2, animal3, animal4, animal5};
        for (Animal animal : animals) {
            System.out.println((animal));
        }
        System.out.println("**********************");
        Arrays.sort(animals);
        for (Animal animal : animals) {
            System.out.println((animal));
        }
        /*
         сортировка по имени -->>
         Animal_5 {name= Anaconda, weight= 100, color= yellow}
         Animal_2 {name= Bear, weight= 150, color= braun}
         Animal_4 {name= Elephant, weight= 700, color= grey}
         Animal_3 {name= Fox, weight= 45, color= orange}
         Animal_1 {name= Wolf, weight= 60, color= weight}
        */
        System.out.println("**********************");
        Arrays.sort(animals, new WeightComparator()); // пердаем массив, создаем и пердаем компаратор
        for (Animal animal : animals) {
            System.out.println((animal));
        }
        /*
        Animal_3 {name= Fox, weight= 45, color= orange}
        Animal_1 {name= Wolf, weight= 60, color= weight}
        Animal_5 {name= Anaconda, weight= 100, color= yellow}
        Animal_2 {name= Bear, weight= 150, color= braun}
        Animal_4 {name= Elephant, weight= 700, color= grey}
         */
        System.out.println("**********************");
        Arrays.sort(animals,new LastLetterComparator());
        for (Animal animal : animals) {
            System.out.println((animal));
        }
        /*
        Animal_5 {name= Anaconda, weight= 100, color= yellow}
        Animal_1 {name= Wolf, weight= 60, color= weight}
        Animal_2 {name= Bear, weight= 150, color= braun}
        Animal_4 {name= Elephant, weight= 700, color= grey}
        Animal_3 {name= Fox, weight= 45, color= orange}

         */



    }
}
