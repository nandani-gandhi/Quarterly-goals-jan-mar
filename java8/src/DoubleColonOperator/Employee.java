package DoubleColonOperator;

public class Employee {
    String name;
    String designation;
    double salary;
    String city;
    Employee(String name, String designation, double salary, String city)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public boolean equals (Object obj)
    {
        Employee e = (Employee) obj;
        if (name.equals(e.name) && designation.equals(e.designation) && salary == e.salary && city == e.city) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

}