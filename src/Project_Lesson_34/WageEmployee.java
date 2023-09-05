package Project_Lesson_34;

public class WageEmployee extends Employee {
    /*
    У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен учитывать
     минимальный размер оплаты труда
     */

    private double wage;


    public WageEmployee(String name, String surname, double workedHours, double wage) {
        super(name, surname, workedHours);
        this.wage = wage;

    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double salaryCalculation() {
        double salary = super.getWorkedHours() * wage;
        if (salary < super.getWorkedHours() * getRatePerHour() ){
             salary = super.getWorkedHours() * getRatePerHour();
        }
        return salary;

    }

    @Override
    public String toString() {
        return
                "WageEmployee id= " + super.getId() + "{" +
                        "name='" + super.getName() + '\'' +
                        ", surname='" + super.getSurname() + '\'' +
                        ", workedHours=" + super.getWorkedHours() +
                        "wage= " + wage +
                        "}";
    }
}
