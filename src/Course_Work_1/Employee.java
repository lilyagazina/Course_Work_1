package Course_Work_1;

public class Employee {
    private String name;
    private int department;
    private double salary;
    private double id;
    private double counter;


    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Ф.И.О. " + name + ", отдел " + department + ", зарплата " + salary;
    }
    public static void listPrint(Employee employee[]) {
        for (int index = 0; index < employee.length; index++) {
            if (index == employee.length - 1) {
                System.out.println(employee[index]);
                break;
            }
            System.out.println(employee[index] + " ");
        }

    }
}