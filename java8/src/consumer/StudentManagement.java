package consumer;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentManagement {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        addStudentData(studentList);
        Predicate<Student> studentPredicate = s1 -> s1.marks>=60;
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
        Consumer<Student> studentConsumer = student ->
        {
            if (studentPredicate.test(student)) {
                System.out.println("RollNo is :-" + student.rollNo + " Name is :-" + student.name + " Marks is : " + student.marks + " Grade is :- " + gradeFunction.apply(student));
            }
            else {
                System.out.println("Fail OR less than 60 Marks Student Data ");
                System.out.println("RollNo is :-" + student.rollNo);
            }
        };
        Consumer<Student> studentConsumer1 = student -> System.out.println("Name is :-" + student.name );
        Consumer<Student> studentConsumer2 = student -> System.out.println("Marks is : " + student.marks);
        Consumer<Student> studentConsumer3 = student -> System.out.println("Grade is :- " + gradeFunction.apply(student));

        for(Student s : studentList)
        {
            if(studentPredicate.test(s))
            {
                studentConsumer.accept(s);
            }
            else
            {
                studentConsumer.andThen(studentConsumer1).andThen(studentConsumer2).andThen(studentConsumer3).accept(s);
            }
        }

    }
    public static void  addStudentData(List<Student> students)
    {
        students.add(new Student(1,"Nandani",90));
        students.add(new Student(12,"Rina",70));
        students.add(new Student(22,"Heena",67));
        students.add(new Student(5,"Keyur",34));
    }
}
