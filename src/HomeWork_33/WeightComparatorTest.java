package HomeWork_33;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WeightComparatorTest {// можно было тестировать все компараторы в одном классе.
    Animal animal1 = new Animal("Wolf", 60, "weight");
    Animal animal2 = new Animal("Bear", 150, "braun");
    Animal animal3 = new Animal("Fox", 45, "orange");
    Animal animal4 = new Animal("Elephant", 700, "grey");
    Animal animal5 = new Animal("Anaconda", 100, "yellow");
    Animal animal6 = new Animal("Lien", 100, "yellow");

    /*
       Animal_3 {name= Fox, weight= 45, color= orange}
       Animal_1 {name= Wolf, weight= 60, color= weight}
       Animal_5 {name= Anaconda, weight= 100, color= yellow}
       Animal_2 {name= Bear, weight= 150, color= braun}
       Animal_4 {name= Elephant, weight= 700, color= grey}
        */
    @Test
    public void sort_test() {
        Animal[] actual = {animal1, animal2, animal3, animal4, animal5};
        Animal[] expected = {animal3, animal1, animal5, animal2, animal4};

        Arrays.sort(actual, new WeightComparator());
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sameWeight_test() {
        Animal[] actual = {animal5, animal6};
        Animal[] expected = {animal5, animal6};
        Arrays.sort(actual, new WeightComparator());
        assertArrayEquals(expected, actual);

    }


}