package Lesson_28;

public class ConstansClass implements InterfaceConstants {
    public static void main(String[] args) {
        int[] ints = new int[MAX];
        for (int i = 0; i < ints.length; i++) {
            if (i >= MAX) {
                System.out.println(ERROR);
            } else {
                ints[i] = i;
                System.out.print(ints[i] + " ");
            }

        }

    }

}
