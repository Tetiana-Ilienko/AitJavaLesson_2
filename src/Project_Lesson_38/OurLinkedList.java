package Project_Lesson_38;

import java.util.Iterator;

public class OurLinkedList<E> implements OurList<E> { // создаем класс, реализующий  наш интерфейс
    /*
     OurLinkedList, который является обобщенным (generic), обозначается <E>.
     Это означает, что этот класс может работать с элементами любого типа, который будет указан при его использовании.
     */
    private int size; // переменная, обозначающая размер списка
    private Node<E> first;// является ссылкой на первый узел (элемент) в связанном списке.
    private Node<E> last; // является ссылкой на последний узел (элемент) в связанном списке.

    public OurLinkedList() { // пустой конструктор
    }

    @Override
    public void append(E value) { // добавление объекта в список


        if (size > 0) {  // если список уже существует
            Node<E> newNode = new Node<>(null, last, value); // создаем ноду, ссылка на след элемен =0,
            // т.к она будет последней, last - прошлая последняя нода
            last.next = newNode; // переписываем ссылку - указывающую на последнюю ноду (только что созданную)
            last = newNode; // объявляем созданную ноду последней

        } else {   //  при добавлении первой ноды
            Node<E> newNode = new Node<>(null, null, value);  // создаем новую ноду( первую), так как она
            // первая у нее нет ссылок на другие ноды
            first = newNode; // присваеваем ссылку - первая нода
            last = newNode; // она же является и последней
        }
        size++; // увеличиваем размер

    }
//---------------------------------------------------
    @Override
    public E get(int index) { // выдать значение по индексу
        if (index >= size || index < 0) { // проверяем индекс на корректность
            throw new IndexOutOfBoundsException(); // выдает ошибку
        }
        Node<E> needle = getNode(index); //  метод возвращает ноту целиком  по индексу и присваивает новой перременной

        return needle.value; // возвращает значение искомой ноды
    }

    private Node<E> getNode(int index) { // возвращает объект целиком (значение ноды и две ссылки)
        Node<E> needle = first; // объявляем первую ноду
        for (int i = 0; i < index; i++) { // идем от начала до заданного индекса
            needle = needle.next; // переходим к следующей ноде  .next- ссыллка на слледующую ноду

        }
        return needle; // возвращает ноду с сылками
    }
    //----------------------------------------------

    @Override
    public void set(E o, int index) {  // найти ноду по индексу и заменить значение

        if (index >= size || index < 0) { // проверяем индекс на корректность
            throw new IndexOutOfBoundsException(); // выдает ошибку
        }
        Node<E> needle = getNode(index);// находим искомую ноду
        needle.value = o; // присваемем новое значение


    }

    @Override
    public int size() { // возвращает размер листа
        return size;
    }

    @Override
    public boolean contains(E o) {// если есть нота с заданным значением. возвращает true/false
        Node<E> needle = first; //  начинаем поиск с первой ноды
        for (int i = 0; i < size; i++) {

            if (needle.value.equals(o)) { // если нашли совпадение
                return true;
            }
            needle = needle.next; // переходим к следующему значению

        }
        return false;
    }

    @Override
    public boolean remove(E o) { //  удаляет по значению
        Node<E> needle = first; // создаем переменную класса Node<E> и назначем ее первой
        for (int i = 0; i < size; i++) {
            if (needle.value.equals(o)) { // ищем нужную ноду
                removeById(i); // удаляем
                return true; // если получилось возвращаем true
            }
            needle = needle.next; // переходим к следующей ноде

        }
        return false;
    }

    @Override
    public E removeById(int index) { // удаление по индексу
        if (index >= size || index < 0) { // проверяем индекс на корректность
            throw new IndexOutOfBoundsException(); // выдает ошибку
        }

        Node<E> nodeToRemove = getNode(index); // создается объект nodeToRemove, который представляет узел (элемент)
        // списка, который будет удален, обращаемся к методу, который возвращает ноду целиком
        Node<E> left = nodeToRemove.prev; // ссылка  которая указывает на предыдущую
        Node<E> right = nodeToRemove.next; // ссылка  которая указывает на следующую

        if (index > 0 && index < size - 1) {  //  когда нода не первая и не последняя
            nodeToRemove.next = null; //  обнуляем   ссылку удаляемой ноты ( следующая)
            nodeToRemove.prev = null; // (предыдущая)
            left.next = right; // .next - следующая от левой от удаляемой соединяется с правой от удаляемой
            right.prev = left;//
        } else if (index == 0) {  //  когда нода первая
            right.prev = null; // обнуляет ссылку на предыдущий узел для узла right.
            first = right; // обновляет переменную first, чтобы указывала на первый узел после удаления.

        } else { // если нода последняя
            left.next = null; // обнуляет ссылку на следующий узел для узла left
            last = left;  //
        }
        size--;


        return nodeToRemove.value; // возвращает значение удаляемой ноды

    }

    public Iterator<E> iterator() { // метод возвращающий объект нашего итератора
        return new OurLinkedListIterator();
    }

    /*
    Итератор (Iterator) в Java - это объект, который предоставляет доступ к элементам коллекции
    (например, списка, массива или множества) без необходимости раскрывать детали внутренней реализации коллекции.
    Итератор позволяет последовательно перебирать элементы коллекции, выполняя действия, такие как чтение,
    обновление или удаление элементов, в зависимости от типа итератора.
    Основные методы итератора в Java включают:

       hasNext(): Метод, который возвращает true, если есть следующий элемент в коллекции, и false,
       если достигнут конец коллекции.

       next(): Метод, который возвращает следующий элемент в коллекции и перемещает указатель на следующий элемент.

     Итераторы позволяют безопасно перебирать элементы коллекции, избегая проблем с параллельным доступом и
     изменением коллекции во время перебора.
     */


    private class OurLinkedListIterator implements Iterator<E> { //создаем приватный класс Iterator реализующий
        // интерфейс Iterator<E>
        Node<E> currentNode = first;

        //  методы работают в связке
        @Override
        public boolean hasNext() { // метод проверяет есть ли следующая нода

            return currentNode != null; // если следующая нода не равна нулю, возвращает true
        }

        @Override
        public E next() { //  метод возвращает текущее значение и переходит к следующему
            E result = currentNode.value; // создается переменная result, которая будет содержать
            // текущее значение элемента, на который указывает текущий "курсор" (переменная currentNode).
            // currentNode.value означает доступ к значению текущего узла (элемента) в списке.
            currentNode = currentNode.next; //обновляется переменная currentNode,
            // чтобы она указывала на следующий элемент (узел) в списке.
            // Это делается путем присваивания currentNode.next переменной currentNode.
            // Таким образом, "курсор" перемещается к следующему элементу.
            return result; // result. Это значение представляет текущий элемент,
            // на который указывает "курсор" до его перемещения к следующему элементу.
        }
    }

    private static class Node<E> { //  Создаем служебный приватный класс. Можно писать класс в классе.

        Node<E> next; //ссылка на следующую ноду
        Node<E> prev;// ссылка на предыдущую
        E value; // значение

        Node() { // пустой конструктор

        }

        public Node(Node<E> next, Node<E> prev, E value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
}
