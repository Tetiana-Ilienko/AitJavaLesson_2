package Project_Lesson_38;

public interface OurList<E> extends Iterable<E> { //создаем интерфейс, который наследует класс Iterable
// все методы в интерфейсе абстрактные
    void append(E o);

    E get(int index);

    void set(E o, int index);

    int size();

    boolean contains(E o);

    boolean remove(E o);

    E removeById(int index);

}
