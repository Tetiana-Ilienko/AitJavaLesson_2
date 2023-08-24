package Lesson_28;
// Интерфейс в Java
public class Main {
    /*
    Интерфейс в Java представляет собой абстрактный тип данных, который содержит
    только абстрактные методы (без реализации) и константы. Интерфейсы определяют контракты,
    которым должны следовать классы, реализующие эти интерфейсы. Одним из ключевых преимуществ
    интерфейсов является возможность реализации множественного наследования методов.
     */
/*
    public interface MyInterface {
        // Абстрактные методы (без реализации)
        public returnType method-name1( param-list);  в интерфейсе все методы публичные public можно не писать по умолчанию
               returnType method-name2( param-list);

        // Константы (по умолчанию статические и final)
        int CONSTANT_VALUE = 42;
    }
    Основные моменты:
    1. Обьект интерфейса создать нельзя
    2. Интерфейс предоставляет полную абстракцию так как его методы не имеют тела.
        С другой стороны, абстрактный класс предоставляет частичную абстракцию
    3. Для реализации классом интерфейса используется ключевое слово implements
    4. При реализации методов интерфейса они должны быть обьявлены публичными
    5. Класс, реализующий интерфейс, должен реализовать все его абстрактные методы или
        сам должен быть обьявлен абстрактным
    6. Все абстрактные методы интерфейса по умолчанию являются публичными
    7. Переменные, обьявленные в интерфейсе по умолчанию являются публичными, статическими и финальными.Они должны
        быть инициализированы при создании. Т.е. фактически являются константами
 */
    public static void main(String[] args) {

    }
}
/*
Интерфейсы могут наследовать другой интерфейс

public interface A{
void method1();
void method2();
***********************************************
public interface B extends A{ интерфейс В наследует интерфейс А
void method3();
***************************************************
public class AB implements B { класс наследует оба интерфейса

 *//*
********************************************************************************
Дефолтный метод (default method) в интерфейсе Java - это метод, который имеет реализацию по умолчанию в самом
 интерфейсе.
 Введение дефолтных методов позволило в Java 8 добавлять новые методы в интерфейсы, не нарушая обратную совместимость
 с классами, которые уже реализовали этот интерфейс.
Основная идея дефолтных методов заключается в том, чтобы предоставить базовую реализацию метода в интерфейсе,
но при этом классы, реализующие этот интерфейс, могут переопределить этот метод по своему усмотрению.

default int getAdminID(){
return 25;}
*/