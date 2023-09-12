package Lesson_41;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static Lesson_41.Main.dublikatesName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private Main lesson;// Это объявление поля lesson, которое представляет экземпляр класса Main.
    //Внутри методов тестирования, мы будем использовать этот экземпляр для вызова методов класса Main и
    // проверки их результатов. Так как мой метод статический - он может вызываться без создания объекта

    @BeforeEach
    public void setUp() {
        lesson = new Main();
        // public void setUp(): Это метод, который выполняется перед каждым тестом.
        // Внутри этого метода, мы создаем экземпляр класса Main и присваиваем его полю lesson.
        // Это позволяет каждому тестовому методу иметь доступ к новому экземпляру Main,
        // чтобы тесты были независимыми друг от друга и могли выполняться в изолированном окружении.
    }

    @Test
    public void getDuplicatesOneElement() {
        List<String> actual = Arrays.asList("Jack");
        List<String> expected = Arrays.asList();

        assertEquals(expected, dublikatesName(actual));
    }
    @Test
    public void getDuplicatesOneDuplicates() {
        List<String> actual = Arrays.asList("Jack", "Mary", "John",  "John", "Ann", "Mary");
        List<String> expected = Arrays.asList("John", "Mary");

        assertEquals(expected, dublikatesName(actual));

    }

    @Test
    public void getDuplicatesManyDuplicates() {
        List<String> actual = Arrays.asList("Jack", "Mary", "John", "John", "John", "Ann", "Mary", "Mary");
        List<String> expected = Arrays.asList("John", "Mary");

        assertEquals(expected, dublikatesName(actual));

    }

}