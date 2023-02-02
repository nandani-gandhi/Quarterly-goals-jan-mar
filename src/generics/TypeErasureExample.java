package generics;

public class TypeErasureExample {
    public static void main(String[] args) {
        Employee<String> employee = new Employee("Nandani");
        System.out.println(employee);
    }
}
class Employee<T>{
    T t;

    public Employee(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name=" + t +
                '}';
    }
}
