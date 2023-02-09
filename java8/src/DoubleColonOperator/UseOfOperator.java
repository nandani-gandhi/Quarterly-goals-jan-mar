package DoubleColonOperator;

import java.util.ArrayList;
import java.util.List;

public class UseOfOperator {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        empData(list);
        list.forEach(new UseOfOperator()::displayData);
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
    public void displayData(Employee employee)
    {
        System.out.println("Name : "+employee.name+" salary : "+employee.salary+" city : "+ employee.city);
    }



}
