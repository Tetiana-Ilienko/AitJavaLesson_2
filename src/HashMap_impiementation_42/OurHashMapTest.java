package HashMap_impiementation_42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {


    @Test
    public void testSizePut_emptyMap_newElements(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"f");
        newMap.put(1,"c");


        assertEquals(3, newMap.size());

    }



}