package generics;

public class Student {

    int rollNo;
    String name;
    Student(int rollNo,String name)
    {
        this.name=name;
        this.rollNo=rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
