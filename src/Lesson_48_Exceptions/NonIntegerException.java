package Lesson_48_Exceptions;

public class NonIntegerException extends Exception { //  создаем свой Exception
    int n;
    int d;

    public NonIntegerException( int n, int d){
        this.n = n;
        this.d = d;
    }

    public String toString(){
        return "result of "+ n +" / " + d +" is not an integer";
    }
}
