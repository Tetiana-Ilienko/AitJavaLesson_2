package Lesson_49_TestException;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static HomeWork_45.Main.unpairedNumber;
import static HomeWork_45.Main.unpairedNumber1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TaskMainTest {
    @Test
    public void testUnpairedNumber_3differentNumber() {
        List<Integer> ints = Arrays.asList(1, 3, 1);
        assertEquals(3, unpairedNumber(ints));
        assertEquals(3, unpairedNumber1(ints));

    }

    @Test
    public void testUnpairedNumber_3different3Number() {
        List<Integer> ints = Arrays.asList(3, 3, 3);
        assertEquals(3, unpairedNumber(ints));
        assertEquals(3, unpairedNumber1(ints));

    }

    @Test
    public void testUnpairedNumber_different5Number() {
        List<Integer> ints = Arrays.asList(1, 1, 15, 1, 1);
        assertEquals(15, unpairedNumber(ints));
        assertEquals(15, unpairedNumber1(ints));

    }

    @Test
    public void testUnpairedNumber_different9Number() {
        List<Integer> ints = Arrays.asList(1, 8, 8, 8, 8, 8, 1, 2, 2);
        assertEquals(8, unpairedNumber(ints));
        assertEquals(8, unpairedNumber1(ints));

    }

    @Test
    public void testUnpairedNumber_throwNoSuchElementException() {
        List<Integer> ints = Arrays.asList(1, 8, 8, 8, 8, 1, 2, 2);
        assertThrows(NoSuchElementException.class, () -> unpairedNumber(ints));

    }


}