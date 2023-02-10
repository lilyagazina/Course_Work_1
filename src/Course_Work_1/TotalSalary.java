package Course_Work_1;

public class TotalSalary {
    public static double counterTotalMonthlySalary(Employee employee[]) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Общие затраты на зарплату в месяц: " + sum);
        return sum;//0
    }
}