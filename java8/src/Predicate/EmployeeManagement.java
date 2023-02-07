package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeManagement {
    public static void main(String[] args)
    {
         List<Employee> list= new ArrayList<>();
         empData(list);

         Predicate<Employee> p1= emp->emp.designation.equals("Manager");
         System.out.println("Managers Information:");
         display(p1,list);

         Predicate<Employee> p2=emp->emp.city.equals("Bangalore");
         System.out.println("Bangalore Employees Information:");
         display(p2,list);

         Predicate<Employee> p3=emp->emp.salary<20000;
         System.out.println("Employees whose salary less than 20000 To Give Increment:");
         display(p3,list);

         System.out.println("All Employees Information who are not managers:");
         display(p1.negate(),list);

         Predicate<Employee> isCEO=Predicate.isEqual(new Employee("Nandani","CEO",50000,"Hyderabad"));

         Employee e1=new Employee("Nandani","CEO",50000,"Hyderabad");
         String result;
         if(isCEO.test(e1))
         {
              result = "Yes";
         }
         else
         {
             result = "No";
         }
         System.out.println("Is Employee designation is CEO? :- "+result);

    }

    public static void empData(List<Employee> list)
    {
        list.add(new Employee("Nandani","CEO",50000,"Hyderabad"));
        list.add(new Employee("Bhavin","Manager",30000,"Hyderabad"));
        list.add(new Employee("Monika","Manager",30000,"Bangalore"));
        list.add(new Employee("Kiran","TeamLead",15000,"Hyderabad"));
        list.add(new Employee("Dixi","TeamLead",15000,"Bangalore"));
        list.add(new Employee("Anushka","JavaDeveloper",10000,"Hyderabad"));
    }
    public static void display(Predicate<Employee> p,List<Employee> list)
    {
        for (Employee e: list )
        {
            if(p.test(e))
            {
                System.out.println(e);
            }
        }
        System.out.println("**************************************************");
    }
}
