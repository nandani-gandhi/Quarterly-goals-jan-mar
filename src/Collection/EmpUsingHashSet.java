package Collection;

import java.util.HashSet;
import java.util.Set;

public class EmpUsingHashSet {
    public static void main(String[] args) {
        Set<Employee> employeeHashSet = new HashSet<>();
        AddEmpData addEmpData = new AddEmpData();
        employeeHashSet.add(addEmpData.employee);
        employeeHashSet.add(addEmpData.employee1);
        employeeHashSet.add(addEmpData.employee2);
        employeeHashSet.add(addEmpData.employee3);
        employeeHashSet.add(addEmpData.employee3);
        for(Employee employee :employeeHashSet)
        {
            System.out.println("Id is :- " + employee.getEid() + " Name is :- " + employee.getName() +" Salary is :- "+employee.getSalary());
        }
    }


}
