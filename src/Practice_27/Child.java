package Practice_27;

public abstract class Child {
    // их имя, фамилию,
    //    возраст и занятие на уроке труда.

    private String name;
    private String surname;
    private int age;

    public Child(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return " Name:  " + name + ", surname: " + surname + ", age: " + age + ".";
    }

    public abstract void doInClass();

}
