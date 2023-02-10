package Course_Work_1;

public class AverageSalary {
    public static double counterAverageSalary(Employee employee[]) {
        double averageSum = 0;
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
            averageSum = sum / employee.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
        return averageSum;
    }
}
