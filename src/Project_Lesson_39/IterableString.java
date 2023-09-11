//package Project_Lesson_39;
//
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//
//public class IterableString implements Iterable<Character>, Iterator<Character> {
//
//    private String str;
//    private  int count = 0;
//
//
//    public IterableString(String str){
//        this.str=str;
//    }
//
//
//    @Override
//    public boolean hasNext() {
//        if (count < str.length()){
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public Character next() {
//        if (count == str.length())
//            throw new NoSuchElementException();
//        count++;
//
//        return str.charAt(count-1); // возврврвщает следующий char пока не кончилась сторка
//    }
//
//    public Iterator<Character> iterator(){
//      return ;
//    }
//
//}
