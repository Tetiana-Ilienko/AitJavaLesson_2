package Lesson_44;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Lesson_44.TaskMain.nameToNumberOccurence1;
import static org.junit.jupiter.api.Assertions.*;

class TaskMainTest {

    @Test
    public void nameToNumberTest(){
        List<String> input = Arrays.asList("John", "Mary","Peter","John");
        assertEquals(2,nameToNumberOccurence1(input,"John"));
    }

    @Test
    public void nameToNumberTest_1(){
        List<String> input = Arrays.asList("John", "Mary","Peter","John");
        assertEquals(1,nameToNumberOccurence1(input,"Peter"));

    }

    @Test
    public void nameToNumberTest_0(){
        List<String> input = Arrays.asList("John", "Mary","Peter","John");
        assertEquals(0,nameToNumberOccurence1(input,"Bill"));

    }
    @Test
    public void nameToNumberTest_onlyToJohn(){
        List<String> input = Arrays.asList("John","John");
        assertEquals(2,nameToNumberOccurence1(input,"John"));

    }

//    ****************************************

    private TaskMain taskMain;// Создается приватное поле taskMain, которое представляет объект класса TaskMain.
    // Это поле будет использоваться в тестовых методах для вызова методов из класса TaskMain и проверки их работы.
    List<String> actual; // Создается переменная actual, которая будет использоваться для хранения ожидаемых результатов.
   @BeforeEach
    public void init(){ // Это метод init(), который инициализирует начальное состояние перед выполнением каждого
       // тестового метода.
        taskMain = new TaskMain(); // Создается новый объект класса TaskMain, который будет использоваться в тестах.
        actual= new ArrayList<>(); // создаем новый лист
        actual.add("mary"); // заполняем его
        actual.add("john");
        actual.add("mayr");
        actual.add("ohjn");
        actual.add("njoh");
        actual.add("mike");
    }

    @Test
    public void testAnagram_noSushAnagram(){
        assertEquals(List.of(), taskMain.findAnagrams("rob",actual));
    }

    @Test
    public void testAnagram_findJohn(){
        List<String> expectet = new ArrayList<>();
        expectet.add("john");
        expectet.add("ohjn");
        expectet.add("njoh");

        assertEquals(expectet, taskMain.findAnagrams("john",actual));
    }
    @Test
    public void testAnagram_onlyName(){
        List<String> expectet = new ArrayList<>();
        expectet.add("mike");


        assertEquals(expectet, taskMain.findAnagrams("mike",actual));
    }




}