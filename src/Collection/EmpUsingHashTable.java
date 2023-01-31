package Collection;

import java.util.Hashtable;

public class EmpUsingHashTable {
    public static void main(String[] args) {
        Hashtable<Integer,Employee> employeeHashtable = new Hashtable<>();
        AddEmpData addEmpData= new AddEmpData();
        employeeHashtable.put(11,addEmpData.employee);
        employeeHashtable.put(23,addEmpData.employee5);
        employeeHashtable.put(9,addEmpData.employee4);
        for(Integer integer : employeeHashtable.keySet())
        {
            System.out.println("Key is :- "+ integer + " Value is :- "+ employeeHashtable.get(integer));
        }
        employeeHashtable.putIfAbsent(13,addEmpData.employee1);
        System.out.println("Employee Details :-" + employeeHashtable.entrySet());
        employeeHashtable.replace(9,addEmpData.employee6);
        System.out.println("Employee Details After replace by key:-");
        for(Integer integer : employeeHashtable.keySet())
        {
            System.out.println("Key is :- "+ integer + " Value is :- "+ employeeHashtable.get(integer));
        }
        employeeHashtable.clear();
        System.out.println("After clear :-" + employeeHashtable);

    }
}
