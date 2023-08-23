package Practice_27;

/*
name - Helen, second name - Black, age 14. She is a girl
    Helen cooks soup
 */
public class Girl extends Child {

    public Girl(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void doInClass() {
        System.out.println("She is a girl. "+
               getName() + " cooks soup.");
    }


}
