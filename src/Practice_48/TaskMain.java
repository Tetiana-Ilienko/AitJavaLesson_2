package Practice_48;

import java.util.function.Supplier;

public class TaskMain {

    /* В обеих задачах можно использовать только логические операторы &&, || , !, ^

    1.Воспитательница в детском саду знает, что если Джек и Питер оба веселые или наоборот оба
    очень серьезные, то они что-то затевают и надо сохранять бдительность. Нужно помочь
    воспитательнице и написать метод, возвращающий  true когда оба мальчика смеются или ходят серьезные
    jackSmile peterSmile
    kidsTrouble(jackSmile, peterSmile)
    kidsTrouble( true, true) -> true
    kidsTrouble(true,false) -> false
    kidsTrouble(false,true) -> false
    kidsTrouble(false,false) -> true

    2. Написать метод, определяющий является ли год високосным.
      Условия високосности года :

       -1ое условие, должно выполняться всегда - год делится без остатка на 4
         плюс к этому должно обязательно выполняться одно из следующих условий :
       - год не делится без остатка на 100 либо
         год делится без остатка на 100 но при этом еще делится без остатка на 400
     */

    public  boolean kidsTrouble(boolean jackSmile, boolean peterSmile){
        return (peterSmile && jackSmile) || (!peterSmile && !jackSmile);

    }

    public boolean kidsTrouble1(boolean jackSmile, boolean peterSmile){
        return !jackSmile != peterSmile; // jackSmile == peterSmile

    }

}
