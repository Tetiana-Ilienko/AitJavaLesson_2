package Lesson_48_ENUM;

public enum Directions {
    WEST("W"),
    NORTH("N"),
    EAST("E"),
    SOUTH("S"); // в конце перчесления, если дальше идет код ставиться " ; "


    private final String letter; // объявление переменной

    Directions(String letter){ // конструктор
        this.letter = letter;
    }

    public String getLetter(){
        return this.letter;
    }
}
