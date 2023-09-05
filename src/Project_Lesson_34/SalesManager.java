package Project_Lesson_34;

public class SalesManager extends Employee {
    /*
     У менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от объема продаж.
     Но его метод оплаты тоже должен учитывать минимальный размер оплаты труда
     */

    private double salesVolume;
    private double percent;


    public SalesManager(String name, String surname, double workedHours, double salesVolume, double percent) {
        super(name, surname, workedHours);
        this.salesVolume = salesVolume;
        this.percent = percent;

    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(double salesVolume) {
        this.salesVolume = salesVolume;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public double salaryCalculation() {
        double salary = (salesVolume * percent);
        if (salary < super.getWorkedHours() * getRatePerHour()){
            salary = super.getWorkedHours() * getRatePerHour();
        }
        return salary;

    }

    @Override
    public String toString() {
        return
                "SalesManager id= " + super.getId() + "{" +
                        "name='" + super.getName() + '\'' +
                        ", surname='" + super.getSurname() + '\'' +
                        ", workedHours=" + super.getWorkedHours() + " percent=" + percent+
                        "}";
    }
}
