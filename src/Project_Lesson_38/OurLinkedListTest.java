//package Project_Lesson_38;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class OurLinkedListTest {
//
//    private OurLinkedList<Integer> list; //  создаем объект типа   (Integer)
//
//    @BeforeEach
//    public void setUp() {
//        list = new OurLinkedList<>();
//    }
//
//    @Test
//    public void testAppendGet_emptyList_addOneElement() {
//        list.append(5);
//        assertEquals(5, list.get(0));
//
//    }
//
//    public void testAppendGet_emptyList_addSeveralElement() {
//
//    }
//
//    @Test
//    public void testSize_EmptyList_appendsOneElement() { //
//        list.append(5);
//        assertEquals(1, list.size());
//    }
//
//    public void textSize_emptyList_addOneElement() {
//        Integer[] expected = {1, 3, -1};
//        for (int i = 0; i < expected.length; i++) {
//            list.append(expected[i]);
//
//        }
//        assertEquals(expected.length, list.size());
//    }
//
//    public void testSet_oneElement_swapsElement() {
//        list.append(0);
//        list.set(10, 0);
//        assertEquals(10, list.get(0));
//    }
//
//    @Test
//    public void testSet_severalElements_swapsFirstLastMiddleElts() {
//        Integer[] source = {1, 4, -17, 18, 6};
//        for (int i = 0; i < source.length; i++) {
//            list.append(source[i]);
//
//        }
//        list.set(10, 0);
//        list.set(100, 4);
//        list.set(-1000, 2);
//
//        Integer[] expected = {10, 4, -1000, 18, 100};
//        for (int i = 0; i < expected.length; i++) {
//            assertEquals(expected[i], list.get(i));//  поопчередно в цикле сравниваем все элементы
//
//        }
//    }
//
//    public void testRemoveById_nonEmptyList_removesFirstElt() {
//        list.append(5);
//        list.append(15);
//        list.append(2);
//        list.append(17);
//        list.append(23);
//        Integer val = list.removeById(0);
//        assertEquals(5, val);
//
//        Integer[] expected = {15, 2, 17, 23};
//        for (int i = 0; i < expected.length; i++) {
//            assertEquals(expected[i], list.get(i));//  поопчередно в цикле сравниваем все элементы
//
//        }
//        assertEquals(4, list.size());
//
//    }
//
//    @Test
//    public void testRemoveById_nonEmptyList_removesMidlElt() {
//        list.append(5);
//        list.append(15);
//        list.append(2);
//        list.append(17);
//        list.append(23);
//        Integer val = list.removeById(2);
//        assertEquals(2, val);
//
//        Integer[] expected = {5, 15, 17, 23};
//        for (int i = 0; i < expected.length; i++) {
//            assertEquals(expected[i], list.get(i));//  поопчередно в цикле сравниваем все элементы
//
//        }
//        assertEquals(4, list.size());
//
//    }
//
//    public void testRemoveById_nonEmptyList_removesLastElt() {
//        list.append(5);
//        list.append(15);
//        list.append(2);
//        list.append(17);
//        list.append(23);
//        Integer val = list.removeById(4);
//        assertEquals(23, val);
//
//        Integer[] expected = {5, 15, 2, 17};
//        for (int i = 0; i < expected.length; i++) {
//            assertEquals(expected[i], list.get(i));//  поопчередно в цикле сравниваем все элементы
//
//        }
//        assertEquals(4, list.size());
//
//    }
//
//    public void testRemove_nonEmptyList_removesLastElt() {
//        list.append(5);
//        list.append(15);
//        list.append(2);
//        list.append(17);
//        list.append(23);
//        boolean removed = list.remove(23);
//        assertTrue(removed);
//        Integer[] expected = {5, 15, 2, 17};
//        for (int i = 0; i < expected.length; i++) {
//            assertEquals(expected[i], list.get(i));//  поопчередно в цикле сравниваем все элементы
//
//        }
//        assertEquals(4, list.size());
//
//    }
//
//+
//
//
//}