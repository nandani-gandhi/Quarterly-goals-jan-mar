package Collection;

import java.util.TreeMap;

public class EmpUsingTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,Employee> employeeTreeMap = new TreeMap<>();
        AddEmpData addEmpData = new AddEmpData();
        employeeTreeMap.put(1,addEmpData.employee);
        employeeTreeMap.put(2,addEmpData.employee1);
        System.out.println("Employee Details"+employeeTreeMap.entrySet());
    }
}
