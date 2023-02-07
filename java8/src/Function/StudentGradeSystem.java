package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGradeSystem {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        addStudentData(studentList);
        Function<Student,String> gradeFunction = s1->{
            int marks = s1.marks;
            if(marks >= 90)
            {
                return  "A[Distinction]";
            }
            else if(marks>=60)
            {
                return "B[First Class]";
            }
            else if(marks>=50)
            {
                return "C[Second Class]";
            }
            else if(marks>=35)
            {
                return "D[Third Class]";
            }
            else
            {
                return "fail";
            }
        };
        Predicate<Student> studentPredicate = s1 -> s1.marks>=60;
        for(Student s : studentList)
        {
            if(studentPredicate.test(s))
            {
                System.out.println("RollNo is :-" + s.rollNo + " Name is :-" + s.name + " Marks is : " + s.marks + " Grade is :- " + gradeFunction.apply(s));
            }
            String grade = gradeFunction.apply(s);
            passStudent(grade,s);
        }
        Function<List<Student>,Integer> studentTotalMark= mark->{
            int total=0;
            for(Student e: mark)
            {
                total=total+e.marks;
            }
            return total;
        };
        System.out.println("Total Marks of all Student :-"+studentTotalMark.apply(studentList));
    }
    public static void  addStudentData(List<Student> students)
    {
        students.add(new Student(1,"Nandani",90));
        students.add(new Student(12,"Rina",70));
        students.add(new Student(22,"Heena",67));
        students.add(new Student(5,"Keyur",34));
    }
    public  static void passStudent(String grade,Student student)
    {
        Predicate<String> garde = g1 -> g1.equals("fail");
        if(garde.test(grade))
        {
            Function<Student,Student> increment = studentMark ->
            {
                studentMark.marks = studentMark.marks+10;
                return studentMark;
            };
            increment.apply(student);
            System.out.println("Roll no:- "+student.rollNo+" Name :-"+student.name+" Marks After Increment :- "+student.marks);
        }
    }

}
