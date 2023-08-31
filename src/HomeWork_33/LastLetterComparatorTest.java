package HomeWork_33;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LastLetterComparatorTest {
    Animal animal1 = new Animal("Wolf", 60, "weight");
    Animal animal2 = new Animal("Bear", 150, "braun");
    Animal animal3 = new Animal("Fox", 45, "orange");
    Animal animal4 = new Animal("Elephant", 700, "grey");
    Animal animal5 = new Animal("Anaconda", 100, "yellow");

    /*

        Animal_5 {name= Anaconda, weight= 100, color= yellow}
        Animal_1 {name= Wolf, weight= 60, color= weight}
        Animal_2 {name= Bear, weight= 150, color= braun}
        Animal_4 {name= Elephant, weight= 700, color= grey}
        Animal_3 {name= Fox, weight= 45, color= orange}

         */

    @Test
    public void sorted_test() {

        Animal[] actual = {animal1, animal2, animal3, animal4, animal5};
        Animal[] expected = {animal5, animal1, animal2, animal4, animal3};

        Arrays.sort(actual,new LastLetterComparator());
        assertArrayEquals(expected, actual);
    }
    @Test
    public void nullAnimal_test(){
        Animal[] actual = {};
        Animal[] expected = {};

        Arrays.sort(actual,new LastLetterComparator());
        assertArrayEquals(expected, actual);
    }

}