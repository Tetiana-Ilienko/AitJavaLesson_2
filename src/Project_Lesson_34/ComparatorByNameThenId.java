package Project_Lesson_34;

import java.util.Comparator;

public class ComparatorByNameThenId implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        int res = employee1.getName().compareTo(employee2.getName());
        if (res==0){
            res = Integer.compare(employee1.getId(),employee2.getId());
        }

        return res;
    }
}
