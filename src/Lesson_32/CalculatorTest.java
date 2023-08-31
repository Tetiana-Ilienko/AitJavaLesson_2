package Lesson_32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// import static org.junit.jupiter.api.Assertions.*; //  вызываем библиотеку юпитер со всеми методами
class CalculatorTest {

    // создаем тестовый метод.  Желательно создать не один метод, а несколько

    Calculator calculator;

    @BeforeEach         // для того, чтобы метод вызыватся перед каждым тестовым методом помечаем его аннотацией
    public void setUp() {
        calculator = new Calculator(); // создается калькулятор, если метод не статик
    }

    // пишем сам тест
    @Test              // это тестовый метод
    @DisplayName("Simple multiplication should be correct")
    //  делает название метода более информативным.
    // Можно использовать для опрееделения имени метода
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));// выражение, которое и определяет равенство
        // ожидаемого и фактического значения
    }


    @Test
    @DisplayName("Check correct handling of zero")
    void testMultiplyZero() {
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(0, calculator.multiply(5, 0));

    }
    // given ... when... then ... / запись аннотации
    //givenRadius_whenFindArea_thenReturnArea

    @Test
    public void givenRadius1_whenFindArea_thenReturnArea3_14() {
        double actualArea = Calculator.findAria(1d);
        double expectedArea = Math.PI;
        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void giveAAndB_whenCompare_thenReturnBoolean() {
        assertTrue(Calculator.compareNumbers(5, 3));
    }

    @Test
    public void givenThreeAndZero_whenCompare_thenReturnTrue() {
        assertTrue(3 > 0);
    }

    //-------------------------------------------------------------------------
// как работает метод, когда длинна массива 0
// как работает метод с одним элементом в массиве
// в массиве два элемента
// в массиве из нескольких элементов максимальный находиться примерно в середине
//в массиве из нескольких элементов максимальный находиться в начале (первый)
//в массиве из нескольких элементов максимальный находиться в конце (последний)
    private Calculator m = new Calculator();

    @Test
    public void zeroElt_test() {
        int[] actual = {};
        assertEquals(-1, m.findMax(actual));

    }

    @Test
    public void oneElt_test() {
        int[] actual = {2};
        assertEquals(2, m.findMax(actual));
    }

    @Test
    public void dvaElt_test() {
        int[] actual = {2, 2};
        assertEquals(2, m.findMax(actual));
    }

    @Test
    public void severalElt_middle_test() {
        int[] actual = {2, 4, 7, 9, 3, 1, 5,};
        assertEquals(9, m.findMax(actual));
    }
    @Test public void firstElt_test(){
        int[] actual = {10, 2, 4, 7, 9, 3, 1, 5,};
        assertEquals(10,m.findMax(actual));
    }
    @Test public void lastElt_test(){
        int[] actual = {2, 4, 7, 9, 3, 1, 5,10};
        assertEquals(10,m.findMax(actual));
    }


}