package Project_Lesson_34;

import java.util.Arrays;

public class Company {
    /*
    - Company, в котором содержатся методы для добавления сотрудника, удаления сотрудника, вывода на экран списка
        всех сотрудников, и метод для суммирования зарплат всех сотрудников
     */

    private Employee[] employees; // связь has-a
    private int companySize;

    public Company(int capacity) {
        employees = new Employee[capacity]; // задаем размер компании, сотрудников может быть  меньше
        companySize = 0;

    }

    public boolean addEmployee(Employee employee) {
        if (companySize < employees.length) {
            employees[companySize] = employee;
            companySize++;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee employee) {
        for (int i = 0; i < companySize; i++) { // игнорируем незаполенную часть массива
            if (employees[i].equals(employee)) {
                employees[i] = employees[companySize - 1];
                companySize--;
                return true;
            }

        }
        return false;
    }

    public  void display(){
        for (int i = 0; i < companySize; i++) {
            System.out.println((employees[i]));
        }
    }

    public double sumSalary(){
        double sum = 0;
        for (int i = 0; i < companySize; i++) {
            sum = sum + employees[i].salaryCalculation();

        }
        return sum;
    }
    public void sortEmployees(){
        Arrays.sort(employees,0, companySize); //  сортируем до размера компании companySize

    }
    public void sortEmployeesId(){
        Arrays.sort(employees,0, companySize, new ComparatorId()); //  создаем компараторы, потом создаем
        // методы, которые обращаються к этим компараторам
    }

    public void sortEmployeesByNameThenId(){
        Arrays.sort(employees,0, companySize, new ComparatorByNameThenId());}




}
