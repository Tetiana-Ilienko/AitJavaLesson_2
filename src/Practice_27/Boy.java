package Practice_27;

/*
name - Jack, second name = Brown, age 12. He is boy
    Jack makes stools
 */
public class Boy extends Child {

    public Boy(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void doInClass() {
        System.out.println("He is boy. " +
                getName() + " makes stools.");
    }
    public String toString(){
        return super.toString();

    }


}
