package Project_Lesson_34;

import javax.script.Compilable;

public abstract class Employee implements Comparable<Employee>{
    /*
    У сотрудников  должны быть такие поля: id, имя, фамилия, количество проработанных часов. Также должен быть
     метод подсчета зарплаты
     */
    private final int id;
    private String name;
    private String surname;
    private double workedHours;

    static private int counter = 1;
    public  final double RatePerHour = 12.5;

    public Employee(String name, String surname, double workedHours) {
        this.name = name;
        this.surname = surname;
        this.workedHours = workedHours;
        this.id = counter++;
    }

    public double getRatePerHour() {
        return RatePerHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public int getId() {
        return id;
    }

    public abstract double salaryCalculation();

    @Override
    public String toString() {
        return "Employee id= " + id +"{" +
                "name='" + name +  '\'' +
                ", surname='" + surname + '\'' +
                ", workedHours=" + workedHours +
                "}";
    }
    public int compareTo(Employee employee){
        return getSurname().compareTo(employee.getSurname());
    }
}
