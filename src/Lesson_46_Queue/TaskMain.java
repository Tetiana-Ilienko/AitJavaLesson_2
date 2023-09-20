package Lesson_46_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskMain {
    public static void main(String[] args) {

        /*
        Пусть есть массив, принимающий три вида скобок : () , {}, [] (6 различных символов).
        Нужно написать метод, определяющий, является ли порядок в массиве корректным

        {}([]) -  корректный порядок
        {} ( [] { () } ) -  корректный порядок
        { (] -   не корректный порядок

        использовать при решении деку

         */
        TaskMain m = new TaskMain();


        char[] chars = new char[]{'{', '('};
        char[] chars1 = new char[]{'{', '(', '[', ']', ')'};
        char[] chars2 = new char[]{'{', '(', '[', ')'};
        char[] chars3 = new char[]{'{', '}', '(', '[', ')', '}'};


        System.out.println(m.areBracketsCorrect(chars));
        System.out.println(m.areBracketsCorrect(chars1));
        System.out.println(m.areBracketsCorrect(chars2));
        System.out.println(m.areBracketsCorrect(chars3));


    }


    public boolean areBracketsCorrect(char[] brackets) {

        if(brackets.length==0) return false;

//        '{',  '(', '[',  ')'  //  { ( [
//        '{', '}', '(', '[', ')', ']' // ( [ ->)
        if (brackets.length % 2 != 0) return false;
        Deque<Character> deque = new ArrayDeque<>();
        for (char bracket : brackets) {
            if (bracket == '{' || bracket == '(' || bracket == '[') {
                deque.addLast(bracket);
            } else if (deque.size() > 0) {
                char lastOpenBracket = deque.getLast();
                if (bracket == '}' & lastOpenBracket == '{' ||
                        bracket == ')' & lastOpenBracket == '(' ||
                        bracket == ']' & lastOpenBracket == '[') {
                    deque.removeLast();
                } else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return deque.size()==0;
    }
}


