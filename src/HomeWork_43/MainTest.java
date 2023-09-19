package HomeWork_43;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static HomeWork_43.Main.trueFalseMap;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testTrueFalseMap_HasDuplicates(){
        String[] actual = new String[]{"Jack", "Bill","Ann", "Jack","John","Ann"};
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("Ann", true);
        expected.put("Bill", false);
        expected.put("John", false);
        expected.put("Jack", true);
        assertEquals(expected,trueFalseMap(actual));
    }

    @Test
    public void testTrueFalseMap_NonDuplicates(){
        String[] actual = new String[] {"Jack", "Bill","Ann","John"};
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("Ann", false);
        expected.put("Bill", false);
        expected.put("John", false);
        expected.put("Jack", false);
        assertEquals(expected,trueFalseMap(actual));
    }

    @Test
    public void testTrueFalseMap_AllSame (){
        String[] actual = new String[] {"Jack", "Jack","Jack","Jack"};
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("Jack", true);

        assertEquals(expected,trueFalseMap(actual));
    }

    @Test
    public void testTrueFalseMap_EmptyArray(){
        String[] actual = {};
        Map<String,Boolean> expected = new HashMap<>();

        assertEquals(expected,trueFalseMap(actual));
    }



}