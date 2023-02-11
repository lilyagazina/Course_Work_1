package Course_Work_1;

public class Main {
    private static final Employee[] EMPLOYEE = new Employee[10];

    public static void main(String[] args) {
        listEmployees();
        listPrint();
        System.out.println("Общие затраты на зарплату в месяц: " + countTotalMonthlySalary());
        System.out.println("Сотрудник с максимальной заплатой " + countEmployeeMaxSalary());
        System.out.println("Сотрудник с минимальной заплатой " + countEmployeeMinSalary());
        System.out.println("Средняя сумма трат за месяц составила " + countAverageSalary() + " рублей");
        printName();
    }

    public static void listEmployees() {
        EMPLOYEE[0] = new Employee("Аверина Анастасия Викторовна", 1, 68900);
        EMPLOYEE[1] = new Employee("Курочкина Любовь Александровна", 2, 60900);
        EMPLOYEE[2] = new Employee("Медведев Максим Дмитриевич", 2, 62900);
        EMPLOYEE[3] = new Employee("Смирнов Дмитрий Андреевич", 3, 58900);
        EMPLOYEE[4] = new Employee("Икусова Яна Александровна", 3, 55900);
        EMPLOYEE[5] = new Employee("Шашкин Алексей Алексеевич", 4, 48900);
        EMPLOYEE[6] = new Employee("Гуров Александр Викторович", 4, 52900);
        EMPLOYEE[7] = new Employee("Любавина Мария Валерьевна", 5, 45600);
        EMPLOYEE[8] = new Employee("Нагаева Диана Алельшаевна", 5, 47300);
        EMPLOYEE[9] = new Employee("Дырдин Егор Олегович", 5, 43900);
    }

    private static void listPrint() {
        for (Employee employee1 : EMPLOYEE) {
            System.out.println(employee1);
        }
    }

    private static int countTotalMonthlySalary() {
        int sum = 0;
        for (int i = 0; i < EMPLOYEE.length; i++) {
            sum += EMPLOYEE[i].getSalary();
        }
        return sum;
    }

    private static Employee countEmployeeMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEE) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    private static Employee countEmployeeMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEE) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    private static double countAverageSalary() {
        return countTotalMonthlySalary() / (double) EMPLOYEE.length;
    }

    private static void printName() {
        for (Employee employee : EMPLOYEE) {
            System.out.println(employee.getName());
        }
    }
}
