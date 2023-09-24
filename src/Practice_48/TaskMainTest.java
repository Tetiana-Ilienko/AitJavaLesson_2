package Practice_48;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TaskMainTest {
    /*
    kidsTrouble( true, true) -> true
    kidsTrouble(true,false) -> false
    kidsTrouble(false,true) -> false
    kidsTrouble(false,false) -> true
     */

    TaskMain taskMain;
    @BeforeEach
    public void setUp(){
        taskMain = new TaskMain();
    }
    @Test
    public void testKidsTrouble1_TrueUndTrue(){
        boolean expected = true;
        boolean jack =true;
        boolean peter = true;

        assertEquals(expected,taskMain.kidsTrouble1(jack,peter));
    }

    @Test
    public void testKidsTrouble1_TrueUndFalse(){
        boolean expected = false;
        boolean jack =true;
        boolean peter = false;

        assertEquals(expected,taskMain.kidsTrouble1(jack,peter));
    }

    @Test
    public void testKidsTrouble1_FalseUndTrue(){
        boolean expected = false;
        boolean jack =false;
        boolean peter = true;

        assertEquals(expected,taskMain.kidsTrouble1(jack,peter));
    }

    @Test
    public void testKidsTrouble1_FalseUndFalse(){
        boolean expected = true;
        boolean jack =false;
        boolean peter = false;

        assertEquals(expected,taskMain.kidsTrouble1(jack,peter));
    }

}