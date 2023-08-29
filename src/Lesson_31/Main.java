package Lesson_31;
// wrapper_classes_and_generics
//  классы-обертки Wrapper Classes
public class Main {
    public static void main(String[] args) {

    /*
    int,     long, float, double, short, boolean, byte, char // примитивные типы
    Integer  Long, Float  Double  Short  Boolean  Byte  Character // их обертки

//    пробразование примитивных типов в обертки:
      */
        // 1 вариант используя конструктор
        Integer one = new Integer(1);
        System.out.println(one);

        // 2.  метод valueOf()
        Integer dva = Integer.valueOf(2);
        System.out.println(dva);

        int dvaPrimitive = dva.intValue();
        System.out.println(dvaPrimitive);

        //3.  autoboxing and unboxing / автоматически запаковывается и распаковывыется

        Integer five = 5; // autoboxing

        Integer six = new Integer(6); // autoboxing
//        int res = getSquare(six);          //unboxing
//        System.out.println(res);
//*********************************************************************
        for (Integer i = 0; i < 10; i++) {  // такой цикл будет работать намного медленнее ( похоже на класс String)
            System.out.print(i + " ");
        }
        System.out.println();
//*********************************************************************
        System.out.println(Integer.parseInt("12345") + 1);// преврашает строчное превращение числа в число
        // -->> 12346
        //********************************************************************
        Integer value = Integer.valueOf(128);
        Integer value1 = Integer.valueOf(128);
        System.out.println(value.equals(value1));

        Integer value2 = Integer.valueOf(127);//  размер 1 byte
        Integer value3 = Integer.valueOf(127);
        System.out.println(value2 == value3); //  все таки сравнивать имеет смысл через .equals


//        public static int getSquare( int i){ //unboxing
//            return i*i;
//        }
//********************************************************************************************************************
     /*
    Обобщения, Дженерики Generics

    Дженерики позволяют не указывать конкретный тип, который будет использоваться.
    Поэтому мы можем указать что класс является обобщенным с помощью т.н. универсального параметра в
    угловых скобках <>  после имени класса. Вместо этого параметра впоследствии можно подставить любой тип

     */

        Person<Integer> john = new Person<>("John", 35); // пишем <>!!!
        System.out.println(john.getName());
        System.out.println(john.getAge());


        Person<String> bill = new Person<>("Bill", "forty years");
        System.out.println(bill.getName());
        System.out.println(bill.getAge());
      /*
    проблема безопасности типов - большой проект и мы не знаем, что там будет. Class object -  неподходит,
    String -  также.
    для этого исполльзуються Обобщения, Дженерики Generics

       */


//           Person<Integer> peter = new Person<>("Peter","twenty years"); // предаю String?  а указан Integer ->>>
        //        идея выдает ошибку (несоответствие типов)

//**********************************************************************************************
//         обобщенные методы
//        будут использовать универсальные параметры
        /*
        public <T> void printArray( T[] values){ // создаем универсальный метод ( на вход даем любые параметры)
        for( T value : values){
            System.out.print(value +" ");
        }
         */
//
//        Printer printer = new Printer(); / создаем объект  printer класса Printer
//
//        Integer[] ints = {1,2,3,4,5};
//        String[] strings = {"a","b","c"};
//
//        printer.<Integer>printArray(ints); //  вызываем метод
//        System.out.println();
//        printer.<String>printArray(strings);
//*********************************************************************************************
//         обобщенные интерфейсы
        /*
        public interface Personasable<T> {

        T getAge();
        String getName();
         }
         */
//        -----------------------------------------
        /*
        public class Person1 implements Personasable<Integer>{
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public Integer getAge() {
        return age;
    }
    @Override
    public String getName() {
        return name;
    }
}
         */
//****************************************************************************************
//        несколько универсальных параметров
        /*
        public class Person2<T,N>{ / если два обоьщенных параметра на вхлоде - в классе Main  указываем два параметра
    private N name;
    private T age;

    public Person2(N name, T age) {
        this.name = name;
        this.age = age;
    }

    public N getName() {
        return name;
    }

    public T getAge() {
        return age;
    }
    }
    ------------------------------------------------------
         */
//        Person2<Integer,String> ann = new Person2<>("Ann",23); / в классе Main  указываем два параметра
//        System.out.println(ann.getName());
//        System.out.println(ann.getAge());
//****************************************************************************************
//         обобщенные конструкторы
//         - в этом случае перед конструктором также указывают в угловых скобках универсальные параметры
/*
      public class Person3 {

       private String name;
       private int age;

        <T>Person3( T name, int age){
        this.name = name.toString();
        this.age = age;
    }
}
 */

    }
}





