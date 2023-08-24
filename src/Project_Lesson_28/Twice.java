package Project_Lesson_28;

//  создает последовательность чисел,с шагом 2

public class Twice implements Series {
    int start;
    int value;

    int previous;

    public Twice() {
        start = 0;
        value = 0;
        previous = -1;
    }

    @Override
    public int getNext() {
        value += 2;
        return value;
    }

    @Override
    public void reset() {
        value= start;
        previous = previous -1;

    }
    @Override
    public void setStart(int a) {
        start=a;
        value=a;
        previous = a-1;

    }
    int getPrevious(){ //  метод есть в классе и его нет в интерфейсе. Можно создавать свои методы
        return previous;
    }
}
