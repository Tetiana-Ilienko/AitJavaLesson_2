package HomeWork_49;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    Main res;

    @BeforeEach
    public void setUp() {
        res = new Main();
    }

    @Test
    public void testMultiplyDeque_true_Num36() {
        List<Integer> actual = Arrays.asList(2, 5, 18, 70);

        assertTrue(res.multiplyDeque(actual, 36));
    }

    @Test
    public void testMultiplyDeque_false_Num40() {
        List<Integer> actual = Arrays.asList(2, 5, 18, 70);

        assertFalse(res.multiplyDeque(actual, 40));
    }

    @Test
    public void testMultiplyDeque_true_Num12() {
        List<Integer> actual = Arrays.asList(2, 3, 4, 6, 70);

        assertTrue(res.multiplyDeque(actual, 12));
    }

    @Test
    public void testMultiplyDeque_false_OwnElementNum9() {
        List<Integer> actual = Arrays.asList(2);

        assertFalse(res.multiplyDeque(actual, 9));
    }

    @Test
    public void testMultiplyDeque_false_TwoElementNum17() {
        List<Integer> actual = Arrays.asList(2,8);

        assertFalse(res.multiplyDeque(actual, 17));
    }


}