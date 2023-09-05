package Lesson_35;
// Lambda Expressions - Лямбда выражения
public class Main {

    /*
    Lambda expressions and Functional Interfaces
    Лямбда выражения и функциональные интерфейсы

    Лямбда выражения - это фактически форма анонимного класса, анонимный метод ( метод без названия)
    Лямбда выражения связаны с функциональными интерфейсами
    ------------------------------------------------------------------
     Project Lesson 34/ / так делалось до 8 версии:
     при таком написании с импользованием анонимных классов не нужно создавать отдельно компаратор
     -----------------лямда выражение записанное как метод-------------------
     public void sortEmployeesById(){
        Arrays.sort(employees,0,companySize, new Comparator<Employee>(){// обращаемся к интерфейсу компаратор
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getId(),e2.getId());
            }

        });
    }


__________________________________________________________________________________
    Функциональный интерфейс - это интерфейс с одним абстрактным методом
    package Lesson_35;

    @FunctionalInterface
    public interface SomeInterface {
    void doSomething( String str);
    }
____________________________________________________________________________________
    Синтаксис лямбда выражения
       параметры -> тело лямбда выражения
       parameters -> lambda body - для записи простых лямдавыражений

       () -> 100.0 - лямда выражение без параметров
       эквивалентно
       public double return100(){
        return Math.random()*1000;
    }
    -------------------------------
       при сложных - испоьзуются фигурные скобки и выражение записывается как метод(см выше)

       (n) -> 2.0 / n; -   c параметрами
       (n) -> (n % 2) == 0;  возвращает boolean / если четное возвращает true
        n -> 1/n;





     */
    public static void main(String[] args) {
        //  чтобы не создавать отдельный класс для компиляторов, и потом создавать объекты компилятора в методе
        // мы создаем /anonymous classes/ @FunctionalInterface
        // хоть это и интерфейс - мы можем создать обьект --->>
//        SomeInterface someInterface = new SomeInterface() {  //  после создания объеска открываем фигурные скобочки
//            // и прописываем сам метод
//            @Override
//            public void doSomething(String str) {
//                System.out.println(str.toLowerCase());
//
//            }
//        }; // !!!нужна запитая
//       // someInterface.doSomething("HELLO"); // вызываем метод, он уже переопределен


        SomeInterface someInterface;
        someInterface = () -> 100.0; // double getValue();// лямбда = абстрактный метод
        System.out.println(someInterface.getValue()); // вывод на печать реализованного
                                                      // с помощью лямбды абстрактного метода
        /*
        Если у абстрактного метода есть на вход параметры - то лямбда  тоже будет принимать параметры
        Лямбда выражение и абстрактный метод должны быть совместимы в плане типа и количества параметров

         OurParamValue ourParamValue =(double n) -> 2.0 / n;
        System.out.println("value with param is "+ourParamValue.getValue(4.0));

        //  ourValue = () -> "str"; - не совместимые параметрыб, в методе на вход double
        --------------------------------------------------------------------------------------
        OutTestInterface isDivided = (a,b) -> (a % b) == 0; // интерфейс = выражение лямбда
        System.out.println("a is divided by b without remainder ? "+isDivided.test(10,2));

        OutTestInterface isMore = (a,b) -> a > b; // теперь тот же метод из интерфейса реализован иначе
        System.out.println("a > b ? "+ isMore.test(10,2));

        OutTestInterface isEqual =(a,b) -> a == b; // третий вариант
        System.out.println("a == b ?"+ isEqual.test(10, 2));

        можем создавать разные варианты реализации метода
        -----------------------------------------------------------------------------------
        вариант абстрактного метода (написанного в интерфейсе) и реализованного с посмощью лямбды
        StringTestInterface isPart = (str1,str2) ->str1.indexOf(str2) != -1;
        String str1 = " This is a test";
        System.out.println(isPart.test(str1,"is"));
        ------------------------------------------------------------

        можно сосздавать так же сложные лямбда выражения

        public interface NumericInterface { // интерфейс
         int method1 ( int n);} // прописанный абстрактный метод

         NumericInterface smallDividor = n -> { // после знака = начинается лямбда выражение

            int res = 1;

            n = n < 0 ? -n : n; // если передаваемая  n < 0  ? превращаем его -n иначе : n

            for ( int i = 2; i <= n; i++){
                if((n % i)==0){
                    res = i;
                    break;
                }
            }
            return res;

        };

        _______________________________________________________________________

        поля объявленные на уровне класса - видны в лямбде и мы их можем в лямбде менять
        переменные, созданную в методе можно использовать а лямбде, но менять их не можем
        ________________________________________________________________________
        функциональные интерфейс может быт обобщенным

        public interface SummableGeneral<T> {

          T calculate( T a, T b);}

          но в лямбда выражении обобщенный интерфейс использовать нельзя (тип надо прописывать)
          SummableGeneral<Integer> sumDigits  = (x,y) -> x + y;
          SummableGeneral<String> sumStrings = (x,y) -> x + y;
          System.out.println(sumDigits.calculate(1,2));
          System.out.println(sumStrings.calculate("1","2"));





         */
    }

}
