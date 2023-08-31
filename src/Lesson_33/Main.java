package Lesson_33;
import java.util.Arrays;
// Comparable Interface
public class Main {
    public static void main(String[] args) {


        // Интерфейс Comparable. ( дженерик)
        /*
        Используется для сравнения однотипных объектов и позволяет сортировать объекты в соответствии с определенным
        порядком. Для этой цели нужно переопределить единственный метод интерфейса compareTo()
        int compareTo( Object o1)
        Метод сравнивает объект, на котором он вызывается со вторым объектом. Результат его работы - целое число,
        которое :
        - больше нуля если первый объект больше второго
        - меньше нуля если меньше
        - равно нулю если объекты равны

        Сравнение происходит по отдельным полям. Т.е. необходимо принять решение какое поле класса будет участвовать
        в определении порядка сортировки объектов. Такой порядок будет называться естественным порядком сортировки
         */

        int[] ints = {45, 2, 15, 0, 5};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        String[] names = {"John", "Jack", "Ann", "Bill"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Player player1 = new Player(3, "Jack", 21);
        Player player2 = new Player(1, "Steve", 19);
        Player player3 = new Player(2, "Alex", 24);

        Player[] team = {player1, player2, player3};
        System.out.println(Arrays.toString(team));
        Arrays.sort(team); // так как класс Player импеменирует Comparable Interface мы можем сортировать массим
        // по заданным
        System.out.println(Arrays.toString(team));
         /*
    Comparator Компаратор интерфейс

    Предоставляет классам возможности дополнительной сортировки по другим критериям, отличным от сортировки
    в естественном порядке.
    Находится в пакете java.util и имеет метод compare()    public int compare(T o1, T o2)

    Принимает два объекта и сравнивает их по тому же принципу, что и compareTo

     */

            Author author1 = new Author("Dauthor", "Rbook", 2000);
            Author author2 = new Author("Nauthor", "Bbook", 1840);
            Author author3 = new Author("Fauthor", "Ubook", 2021);
            Author author4 = new Author("Gauthor", "Sbook", 1972);
            Author author5 = new Author("Aauthor", "Tbook", 1961);

            Author[] authors = {author1, author2, author3, author4, author5};

            System.out.println("Before sort");
            for (Author author : authors)
                System.out.println(author);

            System.out.println();

            System.out.println("Sort by author's name:");
            Arrays.sort(authors);
            for (Author author : authors)
                System.out.println(author);
//            ***************************************************
//            сортировка с помощью Comparator;


            System.out.println();
            System.out.println("Sort by publishing date:");
            Arrays.sort(authors, new PublishingYearComparator()); // врорым параметром передаем - по чему мы
            // хотим отсортировать ( можно создавать прямо в методе)
            for (Author author : authors)
                System.out.println(author);

            System.out.println();
            System.out.println("Sort by book's name:");
            Arrays.sort(authors, new BookNameComparator()); // сортируем вторым параметром по названию книжки
            for (Author author : authors)
                System.out.println(author);


        }
    }














