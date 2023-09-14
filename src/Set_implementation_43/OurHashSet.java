package Set_implementation_43;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class OurHashSet<E> implements OurSet<E>{


    private final static Object INSTANCE = new Object();
    private Map<E, Object> source;

    public OurHashSet(){
        this.source = new HashMap<>(); //  каждый раз при создании сета будет создаваться пустая HashMap<>
    }



    @Override
    public boolean add(E elt) {

        return source.put(elt,INSTANCE) == null;//  если вернулся null (true), значит ключ добавился, если false -
        // такой ключ уже существует и просто значение заменяется
    }

    @Override
    public boolean remove(E elt) {
        return source.remove(elt) != null; //  если вернулся не null (true) -  пара удалилась
    }

    @Override
    public boolean contains(E elt) {
        return source.containsKey(elt);
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public Iterator<E> iterator() {
        return source.keySet().iterator();//  вызываем итератор для набора ключей
    }
}
