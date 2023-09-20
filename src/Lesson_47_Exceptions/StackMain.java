package Lesson_47_Exceptions;

import java.util.Stack;

public class StackMain {
    /*
    Stack (стек) - это структура данных, которая работает по принципу "последний вошел, первый вышел"
    (Last-In-First-Out, LIFO). Это означает, что элемент, который был добавлен последним, будет удален первым. CXZV CXZZZZZZ
    Основные операции, поддерживаемые стеком, включают в себя

    push ()  добавление элемента на вершину стека,

    pop() - удаление элемента с вершины стека
    peek() просмотр элемента на вершине стека без его удаления.

    Stack можно использовать во многих контекстах, когда нужно следовать порядку, обратному порядку добавления элементов.
    Например, стек может быть использован для реализации операций отмены (Undo) в графических приложениях,
    проверке правильности расстановки скобок в арифметических выражениях, обходе деревьев и графов в алгоритмах поиска
    в глубину (Depth-First Search, DFS), и многих других задачах.

     В Java класс Stack является устаревшим (deprecated) и не рекомендуется к использованию. Вместо этого рекомендуется
     использовать класс Deque, а именно его реализации, такие как ArrayDeque.
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // добавление элемента
        stack.push("lemon");
        stack.push("kiwi");
        stack.push("apple");
        stack.push("orange");
        System.out.println(stack); // [lemon, kiwi, apple, orange]

        // возвращает и удаляет
        System.out.println(stack.pop()); // orange
        System.out.println(stack.pop()); // apple

        // возвращает без удаления
        System.out.println(stack.peek()); // kiwi
        System.out.println(stack); // [lemon, kiwi]


    }
}
