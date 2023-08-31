package HomeWork_33;

import java.util.Comparator;

public class LastLetterComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2){
        String str1= animal1.getName();
        String str2= animal2.getName();

        char lastLetter1 =str1.charAt(str1.length()-1);
        char lastLetter2 =str2.charAt(str2.length()-1);


        return Character.compare(lastLetter1,lastLetter2);
    }

}
