package Lesson_45_MergeMethod;

import java.util.HashMap;

// метод merge()
public class MergeMain {
    /*
    Map hashmap = new HashMap()

    hashmap.merge(key,value,remappingFunction)

    параметры:
    key -  ключ, по которому нужно положить значение value
    value - значение, связанное с ключом key
    remapping function -  третий параметр будет использован если ключ key  уже существует

    Метод просто добавляет значение value  по ключу key  если такого ключа в мапе еще нет. А если есть , то в третьем
    параметре ( remapping function )  определяется какое будет   новое значение value
     */
    public static void main(String[] args) {
        HashMap<String,Integer> prices = new HashMap<>(); // создаем новую мапу

        prices.put("Laptop",1000);
        prices.put("TV",500);
        prices.put("Mouse",20);

        System.out.println(prices);// {Laptop=1000, TV=500, Mouse=20}

        // хотим добавить элемент мапы, но таким образом, - если такой ключ есть - мы хотим соединить цены
        // новый товар будет равен по цене= страя цена + новая
        prices.merge("Mobile",300,(oldValue,newValue)->oldValue+newValue); // добавляем новый товар по ключу,
        // которого еще не было
        // третим параметром передаем лямбда выражение (oldValue,newValue)->oldValue+newValue)

        System.out.println(prices); // {Laptop=1000, TV=500, Mouse=20, Mobile=300}
//        **********************
        // если такой ключ уже существует
        prices.merge("Laptop",500,(oldValue,newValue)->oldValue+newValue);
        System.out.println(prices);// {Laptop=1500, TV=500, Mouse=20, Mobile=300}
//        ************************

        HashMap<String,String> cities = new HashMap<>();
        cities.put("Berlin","Germany");
        cities.put("London","England");
        cities.put("Paris","France");
        System.out.println("Capitals: ");
        System.out.println(cities); // {Berlin=Germany, London=England, Paris=France}

        cities.merge("London","GreatBritain",(oldValue,newValue)->oldValue + "/" + newValue);
        cities.merge("Rome","Italy",(oldValue,newValue)->oldValue + "/" + newValue);

        System.out.println("cities changed:");
        System.out.println(cities); // {Rome=Italy, Berlin=Germany, London=England/GreatBritain, Paris=France}
//         ******************************
        // пример как можно соединять повторяющиеся значения
        HashMap<String,Integer> prices1 = new HashMap<>();
        prices1.put("Notebook",500);
        prices1.put("Scanner",350);

        HashMap<String,Integer>prices2 = new HashMap<>();
        prices2.put("TV",700);
        prices2.put("Scanner",310);


        // будем добавлять элементы из первой маы во вторую, если такого ключа не будет, то элемент просто добавиться,
        // а сели есть - будет возвращаться более дешовая цена
        // используем метод forEach
        /*
        Метод forEach - это метод, предоставляемый в Java для выполнения операций над элементами коллекции или массива.
        Этот метод позволяет применить определенное действие (часто представленное в виде лямбда-выражения) к каждому
        элементу коллекции. Он обеспечивает более компактный и выразительный способ выполнения итерации по элементам,
        чем использование циклов.

        Сигнатура метода forEach в интерфейсах Iterable и Stream следующая:
        void forEach(Consumer<? super T> action)

        где:
        action - это функциональный интерфейс Consumer, который представляет действие, выполняемое над каждым элементом
        коллекции.
        Этот интерфейс имеет метод accept(T t), который принимает элемент типа T и выполняет необходимое действие над ним.
         */
        prices2.forEach((key,value)->prices1.merge(key,value,(oldValue,newValue)->{
            // для каждого элемента prices2 - берем ключ и значение второй мапы ->
            //предаем их в метод merge, вызываемый на второй мапе ( в том случе, если ключа нет - добавляем новое значение
            // -> если такой ключ есть  делаем следущее{
            if(oldValue < newValue){ // если старое значение < нового
                return oldValue; //добавляем старое
            }
            else {
                return newValue; // иначе - добавляем новое
            }
        })); // к методу forEach относитья все

        System.out.println("Merged map");
        // печатаем с помощью метода .forEach
        prices1.forEach((key,value)-> System.out.println("key: " + key + " value: " + value));// prices1 для каждого
        // его ключа и значения -> печатаем ()
        /*
        Merged map
        key: Scanner value: 310
        key: TV value: 700
        key: Notebook value: 500
         */


    }






}
