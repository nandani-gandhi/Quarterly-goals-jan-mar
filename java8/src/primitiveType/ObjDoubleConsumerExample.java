package primitiveType;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;

public class ObjDoubleConsumerExample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        empData(list);
        Scanner sc = new Scanner(System.in);
        IntSupplier s = () -> (int) (Math.random() * 10);
        String otp = "";
        for (int i = 0; i < 6; i++) {
            otp = otp + s.getAsInt();
        }
        System.out.println("The 6 digit OTP: " + otp);
        System.out.println("Enter User Name:");
        String getOtp = sc.next();
        String finalOtp = otp;
        Predicate<String> p = checkOtp -> {
            if (finalOtp.equals(getOtp)) {
                return true;
            }
            return false;
        };
        ObjDoubleConsumer<Employee> objDoubleConsumer = (emp, amount) -> emp.salary = emp.salary + amount;
        if (p.test(getOtp)) {
            for (Employee employee : list) {
                System.out.println("Emp Name " + employee.name);
                System.out.println("Emp Salary Before increment : " + employee.salary);
                objDoubleConsumer.accept(employee, 2000);
                System.out.println("Emp Salary after increment : " + employee.salary);
                System.out.println();
            }
        } else {
            System.out.println("No increment");
        }
    }

    public static void empData(List<Employee> list) {
        list.add(new Employee("Nandani", "CEO", 50000, "Hyderabad"));
        list.add(new Employee("Bhavin", "Manager", 30000, "Hyderabad"));
        list.add(new Employee("Monika", "Manager", 30000, "Bangalore"));
        list.add(new Employee("Kiran", "TeamLead", 15000, "Hyderabad"));
        list.add(new Employee("Dixi", "TeamLead", 15000, "Bangalore"));
        list.add(new Employee("Anushka", "JavaDeveloper", 10000, "Hyderabad"));
    }
}
