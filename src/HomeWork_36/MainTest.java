package HomeWork_36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static HomeWork_36.Main.compareLists;
import static HomeWork_36.Main.returnListWithAutNumber;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

class MainTest {


    List<Integer> integerList1;
    List<Integer> integerList2;
    List<String> stringList;




    @BeforeEach
    public void setUp() {


        integerList1= Arrays.asList(5,2,70,11,8);
        integerList2 = Arrays.asList(5,6,88,11,8,8);

    }

    @Test
    void testCompareLists() {

        List<String> expected = Arrays.asList("Yes", "No", "No", "Yes", "Yes");
        assertEquals(expected, compareLists(integerList1, integerList2));
    }
    @Test
    void testCompareLists_Null() {
        integerList1= Arrays.asList();

        List<String> expected = Arrays.asList();
        assertEquals(expected, compareLists(integerList1, integerList2));
    }



    @Test
    void testReturnListWithAutNumber() {
        List<Integer> expected = Arrays.asList(5, 2, 8 );
        assertEquals(expected,returnListWithAutNumber(integerList1,9));
    }
    @Test
    void testReturnListWithAutNumber_expectedNull() {
        integerList1= Arrays.asList( );
        List<Integer> expected = Arrays.asList();
        assertEquals(expected,returnListWithAutNumber(integerList1,9));
    }
}