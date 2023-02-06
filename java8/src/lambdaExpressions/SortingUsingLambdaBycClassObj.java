package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class SortingUsingLambdaBycClassObj {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(200,"Nandani",35000));
        employeeList.add(new Employee(100,"Komal",30000));
        employeeList.sort((e1,e2)->(e1.eid<e2.eid)?-1:(e1.eid> e2.eid)?1:0);
        System.out.println(employeeList);
    }
}
