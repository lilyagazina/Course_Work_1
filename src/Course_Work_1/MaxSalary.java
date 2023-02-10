package Course_Work_1;

public class MaxSalary {
    public static double counterEmployeeMaxSalary(Employee employee[]) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
                System.out.println("Ф.И.О. сотрудника с максимальной заплатой " + employee[i].getName());
            }
        }
        return max;
    }
}

