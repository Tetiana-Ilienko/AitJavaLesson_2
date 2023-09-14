package Lesson_42;

import java.util.*;


// Map
public class MainMap {
    /*
    Интерфейс MAP

    4 класса:
    Hashtable
    HashMap
    LinkedHashMap
    TreeMap

    Мапа представляет собой набор пар ключ-значение.
    В качестве ключей могут быть разные типы данных.
    Ключи в мапе уникальны. Значения могут повторяться.
     */
    public static void main(String[] args) {

        Map<Integer, String> ourMap = new HashMap<>();
        ourMap.put(1200, "Notebook");
        ourMap.put(130, "Printer");
        ourMap.put(500, "TV");
        ourMap.put(10, "Mouse");

        System.out.println(ourMap);

        ourMap.put(12, "Clock"); // добавление элемента
        ourMap.remove(10); // удаление

        System.out.println(ourMap.get(130)); //  по ключу получить значение

        System.out.println(ourMap.size());//  размер

        System.out.println(ourMap.containsKey(500)); // Содержит ли Мапа ключ // boolean
        ourMap.containsValue("TV"); // содержит ли мапа значение // boolean

        System.out.println(ourMap.keySet());// обход мапы по ключам // [1200, 130, 500, 10]

        Set<Integer> mapKeySet = ourMap.keySet(); // создаем множество Set
        /*
        В Java, интерфейс Map представляет структуру данных, которая хранит пары "ключ-значение".
        Каждый ключ в карте уникален и используется для доступа к соответствующему значению.
        Метод keySet() вызывается на объекте карты и возвращает множество всех ключей, содержащихся в этой карте.

        Таким образом, после выполнения этой строки кода, mapKeySet будет содержать все ключи, доступные в ourMap.
        Можно  использовать это множество ключей для итерации по ключам или выполнения других операций,
        связанных с ключами карты.
         */

//        ******************************************************
       /* HashMap<>
       мапа нужна для хранения информации и ее выбирают, когда нужна связка ключ-значение.
       Если надо хранить только список - логичнее выбрать List
        */

        Map<String, Product> productByName = new HashMap<>(); // создаем мапу
        // создаем три объекта класса Product
        Product computer = new Product("Computer", " Computer can calculate fast");
        Product tv = new Product("TV", "TV can show shows");
        Product printer = new Product("Printer", "a printer can print something");

        // добавляем в нашу мапу эти объекты
        productByName.put(computer.getName(), computer);// ключом служит computer.getName()
        productByName.put(tv.getName(), tv);
        productByName.put(printer.getName(), printer);

        System.out.println(productByName);// {TV=Product{name='TV', description='TV can show shows'},........

        Product product = productByName.get("Printer");// получить значение по ключу
        System.out.println(product);//Product{name='Printer', description='a printer can print something'}

        // при вызове метода по несуществующему ключу
        System.out.println(productByName.get("Mouse"));// null

        // полложить по одинаковому ключу невозможно. Одинаковых ключей не может быть
        Product mouse = new Product("Mouse", "This is a mouse");
        productByName.put("Printer", mouse);

        System.out.println(productByName);// произойдет замена, впишется новое значение
        // Printer=Product{name='Mouse', description='This is a mouse'}

        productByName.remove("Printer"); // удаляем объект по ключу

        System.out.println(productByName.containsKey("Printer")); //  проверяем содержание по ключу // false
        System.out.println(productByName.containsValue(computer)); // содержит по значению // true
        //  у этих методов разные сложности
        // поиск по ключу быстрее и у него сложность 1
        // поиск по значению - нужно перебирать весь список - сложность n

        System.out.println(productByName.keySet());
        ; // получить набор ключей// [TV, Computer]

//        *********************************
        // Перебор элементов  в мапе
        // по мапе просто пройти нельзя, посколькуо она не Iterable.
        // для того, чтобы обойти Мапу воспользуемся перебором ключей keySet()

        //1.
        System.out.println("Print by keySet");
        for (String key : productByName.keySet()) { //  идем по сету ключей
            Product product1 = productByName.get(key);// создаем переменную присваеваем ей значение, выданное по ключу
            System.out.println(key + ":" + product1);
            /*
            TV:Product{name='TV', description='TV can show shows'}
            Computer:Product{name='Computer', description=' Computer can calculate fast'}
             */
        }

        //2.
        System.out.println("Print with entrySet");
        for (Map.Entry<String, Product> entry : productByName.entrySet()) {
            // Map.Entry<String,Product> обращение к внутреннему классу
            // productByName.entrySet() - метод выдает пару ключ- значение
            String key = entry.getKey();//  получаем из нашей пары ключ
            Product p = entry.getValue();// получаем из нашей пары значение
            /*
            TV:Product{name='TV', description='TV can show shows'}
            Computer:Product{name='Computer', description=' Computer can calculate fast'}
             */

        }

        //  получить список значений  метод values() ( метод подходит, если не нужны ключи)
        List<Product> products = new ArrayList<>(productByName.values()); // так как на выходе получаем список
        // создаем  List
        System.out.println(products);
        // [Product{name='TV', description='TV can show shows'}, Product{name='Computer',
        //                                               description=' Computer can calculate fast'}]


        //  метод  forEach()
        System.out.println("Print with forEach method");
        productByName.forEach((key, value) -> System.out.println(key + ":" + value));// метод ничего не возвращает
        // используем лямду.(параметры) -> напечатать ключ плюс значение

        // getOrDefault() - передаемключ, если ключ есть, возвращается значение,
        //                  а если нет то возвращается дефолтное значение, заданное зарание

        Product car = new Product("Car", "can drive");
        // как бы мы делали до 8 Java
        // with method get()
        System.out.println(productByName.containsKey("Computer") ? productByName.get("Computer") : car);
        // тернарный оператор - если у нас ключ "Computer" есть, то возвращает "Computer", если нет то возвращает
        // дефолтный по умолчанию car

        // метод  getOrDefault()
        System.out.println("With getOrDefault()");
        System.out.println(productByName.getOrDefault("Car",car));
        //.getOrDefault("Car",car)  - первое значение - ключ, второе - дефолтное


//*************************************************************
        // using Product as key

        Map<Product,Integer> priceByProduct = new HashMap<>(); // переопределяем Мапу
        priceByProduct.put(computer,1000); // теперь ключ computer
        priceByProduct.put(tv,600);
        priceByProduct.put(printer,200);

        System.out.println(priceByProduct);
        // при таком способе задания ключей могут быть проблемы в работе с данной мапой
        // нужно переопределить метод equals() и hashCode

    }
}
