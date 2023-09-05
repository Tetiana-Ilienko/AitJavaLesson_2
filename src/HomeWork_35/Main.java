package HomeWork_35;

import java.util.Arrays;
import java.util.Comparator;


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


        Comparator<Animal> nameComparator = (an1,an2)-> an1.getName().compareTo(an2.getName());

        System.out.println("\n****** NameComparator ********");
        Arrays.sort(animals,nameComparator);
        for (Animal animal : animals) {
            System.out.println((animal));
        }


        Comparator<Animal> weightComparator = (an1,an2)-> Integer.compare(an1.getWeight(),an2.getWeight());

        System.out.println("\n****** WeightComparator ********");
        Arrays.sort(animals,weightComparator);
        for (Animal animal : animals) {
            System.out.println((animal));
        }

        Comparator<Animal> lastLetterComparator = (an1,an2)->{
            String str1= an1.getName();
            String str2= an2.getName();

            char lastLetter1 =str1.charAt(str1.length()-1);
            char lastLetter2 =str2.charAt(str2.length()-1);


            return Character.compare(lastLetter1,lastLetter2);
        };
        System.out.println("\n******* LastLetterComparator ********");
        Arrays.sort(animals,lastLetterComparator);
        for (Animal animal : animals) {
            System.out.println((animal.getName()));
        }
















    }

}
