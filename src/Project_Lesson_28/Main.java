package Project_Lesson_28;

public class Main {
    public static void main(String[] args) {
        Twice twice = new Twice();

        for (int i = 0; i < 10; i++) {
            System.out.println("next value is " + twice.getNext());
        }
        System.out.println();
        System.out.println("Reset value");
        twice.reset();

        for (int i = 0; i < 10; i++) {
            System.out.println("next value is " + twice.getNext());
        }

        System.out.println();
        System.out.println("Start at 10");
        twice.setStart(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("next value is " + twice.getNext());
        }

        System.out.println("********************************");
        Fourth fourth = new Fourth();
        for (int i = 0; i < 10; i++) {
            System.out.println("next value is " + fourth.getNext());
        }

        Series seriesTwice = new Twice(); // cоздаем вссылку через интерфейс - видит только методы
        // прописанные в интерфейсе. все методы в реализованные в классах - не видны
       // twice.
       // seriesTwice.
        Twice twice1 = new Twice();
        Fourth fourth1 = new Fourth();
        printSeries(twice1);
        printSeries(fourth1);








    }
    public static void printSeries(Series series){
        System.out.println(series.getNext()); //  обращаемся к интерфейсу, а не к реализованным классам

    }
}
