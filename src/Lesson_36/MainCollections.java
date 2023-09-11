package Lesson_36;

import java.util.*;

//Collections
public class MainCollections {
    /*
    Коллекции - это джинерики. Они работают с объектами

    List and ArrayList - список, в основе своей имеющий массив и кол-во элементов в листе не будет фиксированно


    Конструкторы ArrayList:
    ArrayList() - создает пустой лист
    ArrayList(Collection collection -  создается лист. в который добавляются все элементы коллекции collection
    ArrayList( inr capacity) - список с начальным размером  capacity
     */
    public static void main(String[] args) {
        /*
        ArrayList<String> names = new ArrayList<>(340); // создаем список, очень желательно указывать тип
        //new ArrayList<>(340) - будет создан список с начальным количество м элементов
        ___________________________________________________________________________________________
        */
        List<String> names = new ArrayList<>(); //  более расширенный способ создания, иногда полезен, иногда - нет
        // зависит от методов, которые будут далее необходимы
        List<Integer> ints = new LinkedList<>();
//      ******************************
        //  add()  добавление элемента в конец листа, метод добавляет true, в случае, если удалось добавить элемент
        names.add("Jone");
        System.out.println(names); // [Jone]
        names.add("Bill");
        System.out.println(names); // [Jone, Bill]

        // добавление элемента по индексу
        names.add(1, "Mary");
        System.out.println(names); // [Jone, Mary, Bill]

        System.out.println(names.add("Jack")); // true
        System.out.println(names); // [Jone, Mary, Bill, Jack]


        List<String> listCapacity = new ArrayList<>(20);
        System.out.println(listCapacity); // [] - массив есть на 20 элементов, но нам это не показывается
//        -------------
        List<Integer> numbers = new ArrayList<>(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(12);
        numbers.add(17);
        System.out.println(numbers);// [1, 1, 12, 17]

//        ***********************************************
        //  size()  метод для определения размера листа
        System.out.println(names.size()); // 4

//        **************************************
        // set() -  изменить элемент
        names.set(2, "Ann");
        System.out.println(names); // [Jone, Mary, Ann, Jack]
//        ***********************************
        // get() - получение элемента
        System.out.println(names.get(0));// Jone
//        **************************
        // remove(Object o) - удаление элемента по названию (объекту)
        names.remove("Ann"); // возвращает boolean
        System.out.println(names); // [Jone, Mary, Jack]
        // remove(int index) - удаление элемента  по идексу
        System.out.println(names.remove(0)); // Jone - выводит на экран, объект, который он удалил
        System.out.println(names); // [Mary, Jack]
//         ------------------------------
        System.out.println(numbers);// [1, 1, 12, 17]
        //  в случае с интами - нужно показать, что имеется ввиду объект, а не индекс
        numbers.remove(Integer.valueOf(1));
        System.out.println(numbers); // [1, 12, 17]
//        **************************
        // int indexOf(Object o) -  возвращает индекс элемента
        int position = names.indexOf("Mary");// [Mary, Jack]
        System.out.println(position);// 0
//        *******************************
        // boolean contains(Object o) -  проверяет и лист данный элемент
        System.out.println(names.contains("Mary")); // true

//       **************************
//       сортировка коллекций
        names.add("Bob");
        names.add("Bil");
        names.add("John");
        System.out.println(names); // [Mary, Jack, Bob, Bil, John]
        Collections.sort(names);
        System.out.println(names);// [Bil, Bob, Jack, John, Mary]
//        ----------------------------
//        обычный цикл for
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
            /*
            Bil
            Bob
            Jack
            John
            Mary
             */
//           или  for-each -  стандартный способ обхода листа
            for (String name : names) {
                System.out.println(name);
            }
            //  итератор
        /*
        Iterator - один их методов интерфейса Collection.  Он возвращает объект,\
        реализующий интерфейс Iterator

        методы интерфейса Итератор
        E next() -  возвращает следующий элемент коллекции, если он работает в цикле -
        он поочереди выдает все элементы цикла.

        while (iterator.hasNext()){ // пример перебора цикла
            if (iterator.next() <= number){ // с условием

        boolean hasNext() -  проверяет не достигнут ли конец коллекции, используют его как условие
        в цикле while

        remove() - удаляет текущий элемент, полученный  последним вызовом next()

         */
        System.out.println("with iterator");
        Iterator<String> ourIterator = names.iterator();
        while (ourIterator.hasNext()){
            System.out.println(ourIterator.next());
            /*
            with iterator
             Bil
             Bob
             Jack
             John
             Mary
             */
        }
/*
        for (String name : names) {
            System.out.println(name);
            names.remove(0); //  проходя по листу - удаление элемента - выйдет ошибка
            для того, чтобы всетаки пройти по листу и провести удаление - одна из возможностей -
            применять итератор
        }

 */
        Iterator<String> ourIterator1 = names.iterator();
        while (ourIterator1.hasNext()){  // hasNext() -  метод обхода коллекции, задает условие
            // пока он выдает true -  мы заходим в цикл

         if (ourIterator1.next().equals("Mary")){
             ourIterator1.remove();}
        }
        System.out.println(names); // [Bil, Bob, Jack, John]

//        --------------------------------------
//        пример работы с методами итератора
        List<String> numbers1 = new ArrayList<>();
        numbers1.add("One");
        numbers1.add("Two");
        numbers1.add("Three");
         Iterator<String> iterator = numbers1.iterator();
         while (iterator.hasNext()){ // обходит список
             String nextStr = iterator.next(); // присваивает следующий элемент
             System.out.println(nextStr);
             if (nextStr.equals("Two")){
                 iterator.remove();
             }

         }
//         *********************************
//        forEach метод

        numbers1.forEach(number -> System.out.println(number)); // проходим по массиву
         /*
         One
         Two
         Three
          */




    }


}




