package generics;

import java.util.ArrayList;
import java.util.List;

public class UnBoundedWildCardExample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Nandani"));
        studentList.add(new Student(2,"Rohan"));
        showData(studentList);
    }
    public static void showData(List<?> list){
        for (Object li : list){
            System.out.println("Data is: "+ list);
        }
    }

}

