package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmpUsingTreeSet {
    public static void main(String[] args) {
        Set<Employee> employeeTreeSet = new TreeSet<>();
        AddEmpData addEmpData = new AddEmpData();
        employeeTreeSet.add(addEmpData.employee);
        employeeTreeSet.add(addEmpData.employee1);
        employeeTreeSet.add(addEmpData.employee2);
        employeeTreeSet.add(addEmpData.employee3);
        employeeTreeSet.add(addEmpData.employee3);
        for(Employee employee :employeeTreeSet)
        {
            System.out.println("Id is :- " + employee.getEid() + " Name is :- " + employee.getName() +" Salary is :- "+employee.getSalary());
        }
    }
}
