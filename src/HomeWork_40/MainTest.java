package HomeWork_40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static HomeWork_40.Main.listOfNames;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private Main homework;

    @BeforeEach
    public void setUp() {
        homework = new Main();
    }

    @Test
    public void removeDuplicatesOneElt() {
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList("John");

        assertEquals(expected, listOfNames(actual));
    }

    @Test

    public void remuveDublicatesNoDuplicates() {
        List<String> actual = Arrays.asList("John", " Peter", "Mary", "Ann");
        List<String> expected = Arrays.asList("John", " Peter", "Mary", "Ann");


        assertEquals(expected, listOfNames(actual));
    }

    @Test
    public void removeDuplicates() {
        List<String> actual = Arrays.asList("Jack", "Mary", "John", "John", "Ann", "Mary", "Mary");
        List<String> expected = Arrays.asList("Jack", "Mary", "John", "Ann");
        assertEquals(expected, listOfNames(actual));
    }


}