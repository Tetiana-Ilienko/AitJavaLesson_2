package Practice_27;

import jdk.jshell.Snippet;

public class Main {
    /*
    школа 20 века
    Девочки на уроках труда готовят суп, а мальчики делают табурет.
    Создать массив из 2 мальчиков и 2 девочек и вывести на экран их имя, фамилию,
    возраст и занятие на уроке труда.
    результат (пример):

    name - Jack, second name = Brown, age 12. He is boy
    Jack makes stools

    name - Helen, second name - Black, age 14. She is a girl
    Helen cooks soup
     */
    public static void main(String[] args) {
        Boy boy1 = new Boy("Jack", "Brown", 12);
        Boy boy2 = new Boy("Alex", "Smith", 13);
        Girl girl1 = new Girl("Helen", "Black", 14);
        Girl girl2 = new Girl("Emma", "Johnson", 11);

        Child[]  kids = { boy1, boy2, girl1, girl2 };

        for (Child var : kids) {
            System.out.println(var);
            var.doInClass();
            System.out.println();
            
        }
       




    }



}
