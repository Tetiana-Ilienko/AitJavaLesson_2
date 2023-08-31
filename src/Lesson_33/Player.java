package Lesson_33;

public class Player implements Comparable<Player> { // реализовывает  Интерфейс Comparable для объектов класса Player
    private int ranking;
    private int age;
    private String name;


    public Player(int ranking, String name, int age ) {
        this.ranking = ranking;
        this.age = age;
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //*****************************************************************
   /*
    public int compareTo(Player p) {
        if (getRanking() - p.getRanking() > 0) {
            return 1;
        } else if (getRanking() - p.getRanking() < 0) {
            return -1;
        } else return 0;
    }

    */
/*
    //     _________2 variant____________________  опасен при работе с большими числами
    public int compareTo(Player p) {               может выйти за пределы интеджера и
        return getRanking() - p.getRanking();      выдать не корректный вариант
    }

    //        ____________3 variant___________________   вызываем класс Integer и сравниваем
    public int compareTo(Player p){                      через него
        return Integer.compare(getRanking(),p.getRanking());
    }
  ____________ новый метод сравнивает по двум критериям______________
 */
    /*   public int compareTo(Player p) {  сравнивает по именам
        return getName().compareTo(p.getName());
    }
    */
    public int compareTo(Player p){
        int playerName = getName().compareTo(p.getName()); // сравнивает по именам, еси имена одинаковые,
                                                           // сравниваем по возрасту
        return playerName == 0 ? Integer.compare(getAge(),p.getAge()): playerName;
        // если равно 0, т.е. имена одинаковые - сравниваем по возрасту, иначе возвращаем по именам

    }


    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
