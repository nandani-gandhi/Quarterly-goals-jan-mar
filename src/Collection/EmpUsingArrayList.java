package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmpUsingArrayList {

    public static void main(String args[]) {

        List<Employee> employeeArrayList = new ArrayList<>();
        AddEmpData addEmpData = new AddEmpData();
        employeeArrayList.add(addEmpData.employee);
        employeeArrayList.add(addEmpData.employee1);
        employeeArrayList.add(addEmpData.employee2);
        employeeArrayList.add(addEmpData.employee3);
        employeeArrayList.add(addEmpData.employee4);
        employeeArrayList.add(addEmpData.employee5);
        employeeArrayList.add(addEmpData.employee6);
        employeeArrayList.add(addEmpData.employee7);
        employeeArrayList.add(addEmpData.employee7);
        System.out.println(employeeArrayList.size());
        employeeArrayList.remove(0);
        employeeArrayList.remove(addEmpData.employee1);
        System.out.println("Before Sorting");
        for(Employee employee :employeeArrayList)
        {
            System.out.println("Id is :- " + employee.getEid() + " Name is :- " + employee.getName() +" Salary is :- "+employee.getSalary());
        }
        // sort by salary
        Collections.sort(employeeArrayList);
        System.out.println("After Sorting by Salary");
        for(Employee employee :employeeArrayList)
        {
            System.out.println("Id is :- " + employee.getEid() + " Name is :- " + employee.getName() +" Salary is :- "+employee.getSalary());
        }

    }

}
