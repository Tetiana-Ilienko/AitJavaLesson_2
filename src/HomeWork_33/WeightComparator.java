package HomeWork_33;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class WeightComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        return Integer.compare(animal1.getWeight(),animal2.getWeight());
    }


}
