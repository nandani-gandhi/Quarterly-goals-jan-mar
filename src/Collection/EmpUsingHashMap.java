/*  Write a program to add an element in HashMap
    - add element in LinkedHashMap and add all the elements of that LinkedHashMap to HashMap
      which define Perilously.
    - Print the Set view containing all the keys
    - Print the Set view containing all the keys and values.
    - Sort the Map Using TreeMap and Iterate the Map Using for Loop
    - Write a program which Use of containsValue() method of Map
    - sort the Map by name using Comparator interface
*/
package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmpUsingHashMap {

    public static void main(String[] args) {
        Map<Integer,Employee> employeeMap = new HashMap<>();
        LinkedHashMap<Integer,Employee> employeeLinkedHashMap = new LinkedHashMap<>();
        AddEmpData addEmpData=new AddEmpData();
        employeeMap.put(22,addEmpData.employee);
        employeeMap.put(44,addEmpData.employee1);
        employeeMap.put(11,addEmpData.employee2);
        employeeLinkedHashMap.put(5,addEmpData.employee3);
        employeeLinkedHashMap.put(3,addEmpData.employee4);
        //stringMap.put(null ,null);
        employeeMap.putAll(employeeLinkedHashMap);
        System.out.println("Key of the Employee Map : "+employeeMap.keySet());
        System.out.println("Key and value of Employee Map : "+employeeMap.entrySet());
        if(employeeMap.containsValue(addEmpData.employee))
        {
            System.out.println("Map contain these data");
        }
        else
        {
            System.out.println("Map does not contain any data like these");
        }
        sortEmpDataByName(employeeMap);
        sortEmpDataUsingHashMap(employeeMap);
    }
    public static void sortEmpDataByName(Map<Integer,Employee> employeeMap)
    {
        ArrayList<Employee> employeeArrayList = new ArrayList<>(employeeMap.values());
        CompareByName compareByName = new CompareByName();
        employeeArrayList.sort(compareByName);
        System.out.println("Employee Details after Short by name Using Comparator : " );
        for(Employee employee : employeeArrayList)
        {
            System.out.println(employee.getEid()+" "+employee.getName()+" "+employee.getSalary());
        }
    }
    public  static  void sortEmpDataUsingHashMap(Map<Integer,Employee> employeeMap)
    {
        TreeMap<Integer,Employee> employeeTreeMap = new TreeMap<>(employeeMap);
        System.out.println("Employee Details after Short by Key Using TreeMap : ");
        for (Integer integer : employeeTreeMap.keySet())
        {
            System.out.println("Key is :- " + integer + " value is:- " + employeeTreeMap.get(integer));
        }
    }

}
