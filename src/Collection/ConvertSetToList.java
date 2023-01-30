package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetToList {
    public static void main(String[] args) {
        Set<Employee> employeeHashSet = new HashSet<>();
        AddEmpData addEmpData = new AddEmpData();
        employeeHashSet.add(addEmpData.employee);
        employeeHashSet.add(addEmpData.employee1);
        employeeHashSet.add(addEmpData.employee2);
        employeeHashSet.add(addEmpData.employee3);
        employeeHashSet.add(addEmpData.employee3);
        System.out.println("HashSet");
        for (Employee employee : employeeHashSet) {
            System.out.println("Id is :- " + employee.getEid() + " Name is :- " + employee.getName() + " Salary is :- " + employee.getSalary());
        }
        List<Employee> employeeList = convertSetToList(employeeHashSet);
        System.out.println("List");
        for (Employee employee : employeeList) {
            System.out.println("Id is :- " + employee.getEid() + " Name is :- " + employee.getName() + " Salary is :- " + employee.getSalary());
        }
    }

    public static List<Employee> convertSetToList(Set<Employee> set) {
        List<Employee> list = new ArrayList<>();

        for (Employee employee : set)
            list.add(employee);

        return list;
        // we can Directly use Constructor to convert
        // return new ArrayList<>(set);
    }
}
