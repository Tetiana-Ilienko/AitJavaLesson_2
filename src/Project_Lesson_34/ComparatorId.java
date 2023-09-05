package Project_Lesson_34;

import java.util.Comparator;

public class ComparatorId implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getId(),employee2.getId());
    }

}
