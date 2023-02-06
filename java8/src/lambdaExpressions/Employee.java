package lambdaExpressions;

public class Employee{
    int eid;
    String name ;
    float salary;

    public Employee(int eid, String name, float salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public void setEid(int eid)
    {
        this.eid=eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public int getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "\n Employee " +
                "eid=" + eid +
                ", name='" + name +
                ", salary=" + salary ;
    }

}
