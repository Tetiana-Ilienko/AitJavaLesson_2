package Project_Lesson_34;

public class Main {
    /*
    Написать программу для бухгалтерии.
    Программа должна уметь:
    -добавлять сотрудников в штат
    -удалять сотрудников из штата
    -рассчитывать зарплату для двух категорий сотрудников
            - сотрудник с почасовой оплатой
            - менеджер по продажам
     У программы должны быть следующие классы:
     - Company, в котором содержатся методы для добавления сотрудника, удаления сотрудника, вывода на экран списка
        всех сотрудников, и метод для суммирования зарплат всех сотрудников
     - классы сотрудников:
        -abstract Employee
        -WageEmployee
        -SalesManager
        У сотрудников  должны быть такие поля: id, имя, фамилия, количество проработанных часов. Также должен быть
     метод подсчета зарплаты
     У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен учитывать
     минимальный размер оплаты труда
     У менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от обьема продаж.
     Но его метод оплаты тоже должен учитывать минимальный размер оплаты труда

     Дополнительно:
     Программа также должна содержать методы, предоставляющие возможность сортировки списка сотрудников
     по следующим критериям:
     - по фамилии
     - по id
     - по имени а если имена одинаковые, то по id
     */
    public static void main(String[] args) {
        Employee sm1 = new SalesManager("Bob","Weight",80,1000000, 0.05);
        Employee sm2 = new SalesManager("Jack","Kurz",50,1300000, 0.05);
        Employee sm3 = new SalesManager("Bob","Braun",20,7000, 0.05);
        Employee wm1 = new WageEmployee("Bob","Braun",50,12);
        Employee wm2= new WageEmployee("Jams","Bond",100,14);
        Employee wm3 = new WageEmployee("Lily","Grey",50,12.5);

        System.out.println(sm3.salaryCalculation());
        System.out.println(wm1.salaryCalculation());

        Company company = new Company(10);
        company.addEmployee(sm1);
        company.addEmployee(sm2);
        company.addEmployee(sm3);
        company.addEmployee(wm1);
        company.addEmployee(wm2);
        company.addEmployee(wm3);
        company.display();

        System.out.println("++++++++++++++++++");

        company.removeEmployee(sm1);
        company.display();
        System.out.println("Total salary" + company.sumSalary());

        System.out.println("================");
        company.sortEmployees();
        company.display();
        System.out.println();
        company.sortEmployeesId();
        company.display();
        System.out.println();
        company.sortEmployeesByNameThenId();
        company.display();






    }
}
