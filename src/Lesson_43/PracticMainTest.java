package Lesson_43;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static Lesson_43.PracticMain.plusElement;
import static org.junit.jupiter.api.Assertions.*;

class PracticMainTest {
    private  PracticMain practicMain;
    @BeforeEach
    public  void  setUp(){
        practicMain = new PracticMain();
    }
    @Test
    public void testPlusElement_hasKeyAB(){
        Map<String,String> map = new HashMap<>();
        map.put("a", "Hello");
        map.put("b", "Word");
        map.put("c", "Hi");

        assertEquals(map,plusElement(map,"a","b"));
    }

    @Test
    public void testPlusElement_hasOneKey(){
        Map<String,String> map = new HashMap<>();
        map.put("a", "Hello");
        map.put("d", "Word");
        map.put("c", "Hi");

        assertEquals(map,plusElement(map,"a","b"));
    }

    @Test
    public void testPlusElement_Empty(){
        Map<String,String> map = new HashMap<>();
        
        assertEquals(map,plusElement(map,"a","b"));
    }




}