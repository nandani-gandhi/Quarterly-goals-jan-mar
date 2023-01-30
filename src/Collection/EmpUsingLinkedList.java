package Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EmpUsingLinkedList {
    public static void main(String[] args) {
        List<Employee> linkedList = new LinkedList<>();
        AddEmpData addEmpData = new AddEmpData();
        linkedList.add(addEmpData.employee);
        linkedList.add(addEmpData.employee1);
        linkedList.add(addEmpData.employee2);
        linkedList.add(addEmpData.employee3);
        linkedList.add(addEmpData.employee4);
        String[] nameArray = new String[linkedList.size()];
        for(Employee employee :linkedList)
        {
            System.out.println("Id is :- " + employee.getEid() + " Name is :- " + employee.getName() +" Salary is :- "+employee.getSalary());
        }
        for (int i =0 ; i < linkedList.size() ; i++ )
        {
            nameArray[i] =  linkedList.get(i).getName();
        }
        System.out.println("Name of Employee in Array :- "+Arrays.toString(nameArray));

    }

}
