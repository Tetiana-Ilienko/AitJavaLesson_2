package Lesson_46;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskMainTest {

    TaskMain m;

    @BeforeEach
    public void setUp() {
        m = new TaskMain();

    }

    @Test
    public void testAreBracketsCorrect_true() {
        char[] actual = new char[]{'{', '}', '(', '[', ']', ')'};
        assertEquals(true, m.areBracketsCorrect(actual));
    }

    @Test
    public void testAreBracketsCorrect_false() {
        char[] actual = new char[]{'{', '(', '[', ')'};
        assertEquals(false, m.areBracketsCorrect(actual));
    }

    @Test
    public void testAreBracketsCorrect_empty() {
        char[] actual = new char[]{};
        assertEquals(false, m.areBracketsCorrect(actual));
    }

}