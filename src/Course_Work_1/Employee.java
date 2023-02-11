package Course_Work_1;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;


    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "id " + id + " Ф.И.О. " + name + ", отдел " + department + ", зарплата " + salary;
    }

}
