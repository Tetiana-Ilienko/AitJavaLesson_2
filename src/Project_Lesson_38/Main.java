package Project_Lesson_38;

public class Main {
    public static void main(String[] args) {
        OurLinkedList<Integer> list = new OurLinkedList<>();

        list.append(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        list.set(10,0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        list.append(5);
        list.append(15);
        list.append(7);
        list.append(2);
        list.append(18);
        list.append(25);
        list.append(115);

        System.out.print(("["));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]"); // [10 5 15 7 2 18 25 115 ]

        list.removeById(3); //  удаляем третий элемент
        System.out.print(("["));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]"); // [10 5 15 2 18 25 115 ]

        System.out.println(list.contains(15)); // true
        System.out.println(list.contains(3)); //  false


        OurList<String> ourList = new OurLinkedList<>();
        ourList.append("Jack");
        String jack = ourList.get(0);
        System.out.println(jack);


    }

//    static OurLinkedList<Human> makeHumanList(){
//        Human john = new Human();
//        Human bill = new Human();
//        Human ann = new Human();
//
//    }
//




}
