package HashMap_impiementation_42;

import java.util.ArrayList;
import java.util.List;

public class OurHashMap<E, T> implements OurMap<E, T> {

    private static int CAPACITY = 10000; // размер нашего создаваемого массива

    List<Node<E, T>>[] source = new ArrayList[CAPACITY]; // создаем массив класса List с емкостью CAPACITY

    int size;


    @Override
    public void put(E key, T value) {
        //  чтобы положить элемент, для начала мы рассчитываем HashCode  ключа
        // превращаем этот код в число, находящееся в диапазоне нашего CAPACITY -
        // фактически превращаем его в индекс массива

        int index = Math.abs(key.hashCode() % CAPACITY);// получили HashCode  ключа
        // Math.abs - получаем абсолютное значение (модуль)

        //  рассмотрим случай, когда в листе, который в бакете  null
        if (source[index] == null) { //  если листа нет
            List<Node<E, T>> list = new ArrayList<>();// создаем новый лист
            Node<E, T> newNode = new Node<>(key, value); // создаем новую ноду и помещаем в нее клюк и значение
            list.add(newNode); // добавляем в лист созданную ноду
            source[index] = list; // лист,который мы создали и есть элемент нашего массива листов в расчитанным индексом
            size++; //  размер мапы увеличился
        } else { // лист уже существует
            // если нода с таким ключом уже есть - ее надо перезаписать
            boolean wasFound = false;
            for (Node node : source[index]) { //  идем по ноде
                if (key.equals(node.key)) { // если ключт такой же  как в листе
                    wasFound = true; //  нода найдена идти дальне по списку нет смысла
                    node.value = value;       // меняем значение
                    break;
                }
            }
            if (!wasFound) { //  если не был наден ключ
                // она попала в существующий лист, но такой ноды нет
                Node<E, T> newNode = new Node<>(key, value); // создаем ноду
                source[index].add(newNode); // лист существует, добавляем в конец новую ноду
                size++;
            }


        }

    }

    @Override
    public T get(E key) {
        Node<E, T> node = findNode(key); //  нода по ключу ищет ноду ( используем private Node<E, T> findNode(E key) )
        return node != null ? node.value : null;
        // если нода не равна null - вернем ее значение

    }
    private Node<E, T> findNode(E key) { // приватный метод, его используют get(E key) и contains(E key)
        // метод возвращает полноценную ноду и ищет ее по ключу
        int index = Math.abs(key.hashCode() % CAPACITY);// определяем индекс бакета

        if (source[index] != null) { // если по индексу есть лист
            for (Node<E, T> node : source[index]) { // будем искать по листу ноду (перебором)
                if (key.equals(node.key)) { // если ключ равен искомой
                    return node; // возвращаем ноду
                }
            }

        }
        return null; // если мы прошли по массиву и ничего не нашли - возвращаем null
    }

    @Override
    public boolean contains(E key) {
        Node<E, T> node = findNode(key);
        return node != null; // вернуть true , если находит ноду
    }

    @Override
    public boolean remove(E key) { //  удалить ноду по ключу
        Node<E, T> node = findNode(key); // вызываем нашш приватный метод
        if (node == null) {// если он возвращает null, значит такой ноды нет
            return false;
        }
        // если нода есть в цикл не попадаем

        int index = Math.abs(key.hashCode() % CAPACITY); //высчитываем индекс по ключу
        source[index].remove(node); // так как это лист, удаляем методом
        node.value = null; // обнуляем значение
        node.key = null;// обнуляем ключ
        size--;    // уменьшаем размер
        return true;
    }

    @Override
    public int size() {
        return size;
    }


    private static class Node<E, T> {

        E key;
        T value;

        public Node(E key, T value) {
            this.key = key;
            this.value = value;
        }
    }

}
