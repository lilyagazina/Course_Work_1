package Course_Work_1;

public class MinSalary {
    public static double counterEmployeeMinSalary(Employee employee[]) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (min == employee[i].getSalary())
                System.out.println("Ф.И.О. сотрудника с минимальной заплатой " + employee[i].getName());
        }
        return min;
    }
}
