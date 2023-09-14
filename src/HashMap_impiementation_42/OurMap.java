package HashMap_impiementation_42;

public interface OurMap <E,T>{


    public void put(E key, T value);

    public T get(E key);

    public boolean contains(E key);


    boolean remove (E key); //  public - можно не писать, так как это интерфейс, методы по умолчанию публичные


    int size();

}
