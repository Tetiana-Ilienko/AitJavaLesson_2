package HomeWork_33;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animal1 = new Animal("Wolf", 60, "weight");
    Animal animal2 = new Animal("Bear", 150, "braun");
    Animal animal3 = new Animal("Fox", 45, "orange");
    Animal animal4 = new Animal("Elephant", 700, "grey");
    Animal animal5 = new Animal("Anaconda", 100, "yellow");
    Animal animal6 = new Animal("Beaver", 10, "yellow");

/*
    Animal_5 {name= Anaconda, weight= 100, color= yellow}
    Animal_2 {name= Bear, weight= 150, color= braun}
    Animal_4 {name= Elephant, weight= 700, color= grey}
    Animal_3 {name= Fox, weight= 45, color= orange}
    Animal_1 {name= Wolf, weight= 60, color= weight}

 */

    @Test
    void compareTrue_test() {
        assertTrue(animal1.compareTo(animal3)>0);
    }
    @Test
    void compareFalse_test(){
        assertFalse(animal5.compareTo(animal2)>0);
    }
    @Test
    void sameFirstLetter_test(){
        Animal[] actual = {animal2,animal5,animal6};
        Animal[] expected = {animal5,animal2,animal6};

        Arrays.sort(actual);
        assertArrayEquals(expected,actual);

    }
}