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
        int indexPercent = 2;
        indexSalary(2);
        System.out.printf("Проиндексированна зарплата на %d%%%n", indexPercent);
        listPrint();
        int department = 2;
        System.out.println("Сотрудник с максимальной заплатой из отдела " + department + ": "
                + countEmployeeDepMaxSalary(department));
        System.out.println("Сотрудник с минимальной заплатой из отдела " + department + ": "
                + countEmployeeDepMinSalary(department));
        System.out.println("Сумма затрат на зарплату по отделу " + department + ": "
                + departmentalPayrollCosts(department));
        System.out.println("Средняя зарплата по отделу " + department + ": "
                + averageSalaryDepartment(department));
        printNameSalary(department);
        indexDepSalary(indexPercent,department);
        System.out.printf("Проиндексированна зарплата на %d%%%n", indexPercent);
        printNameSalary(department);
        int number = 80000;
        moreNumber(number);
        lessNumber(number);

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

    //Базовый уровень
    private static void listPrint() { // распечатывает список
        System.out.println("Все сотрудники: ");
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

    private static void printName() { //Ф.И.О. сотрудников
        System.out.println("Ф.И.О. сотрудников: ");
        for (Employee employee : EMPLOYEE) {
            System.out.println(employee.getName());
        }
    }

    //Повышенная сложность
    public static void indexSalary(int indexPercent) { //индексирует зарплаты
        for (int i = 0; i < EMPLOYEE.length; i++) {
            EMPLOYEE[i].setSalary(EMPLOYEE[i].getSalary() + (EMPLOYEE[i].getSalary() / 100 * indexPercent));
        }
    }

    private static Employee countEmployeeDepMaxSalary(int department) {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEE) {
            if (emp.getSalary() > max && emp.getDepartment() == department) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    private static Employee countEmployeeDepMinSalary(int department) {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEE) {
            if (emp.getSalary() < min && emp.getDepartment() == department) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    public static double departmentalPayrollCosts(int department) { //сумма зарплат 1 отдела
        double salary = 0;
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i].getDepartment() == department) {
                salary += EMPLOYEE[i].getSalary();
            }
        }
        return salary;
    }

    public static double averageSalaryDepartment(int department) { //Средняя зарплата по 1 отделу
        int sumEmpDep = 0;
        int salary = 0;
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i].getDepartment() == department) {
                salary += EMPLOYEE[i].getSalary();
                sumEmpDep++;
            }
        }
        if (sumEmpDep != 0) {
            return salary / (double) sumEmpDep;
        } else {
            return 0;
        }

    }
    public static void indexDepSalary(int indexPercent, int department) { //индексирует зарплаты отдела
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i].getDepartment() == department) {
                EMPLOYEE[i].setSalary(EMPLOYEE[i].getSalary() + (EMPLOYEE[i].getSalary() / 100 * indexPercent));
            }
        }
    }
        private static void printNameSalary ( int department)
        { //распечатать всех сотрудников отдела (все данные, кроме отдела)
            System.out.println("Сотрудники отдела: " + department);
            for (Employee employee : EMPLOYEE) {
                if (employee.getDepartment() == department) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
                }
            }
        }
    public static void lessNumber(int number) {
        // поиска всех сотрудников с зарплатой меньше определенного числа
        System.out.println("Сотрудники с зарплатой меньше " + number + ":");
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i].getSalary() < number) {
                System.out.println(EMPLOYEE[i].getId() + " " + EMPLOYEE[i].getName()
                        + " " + EMPLOYEE[i].getSalary());
            }
        }
    }
    public static void moreNumber(int number) {
        // поиска всех сотрудников с зарплатой больше определенного числа
        System.out.println("Сотрудники с зарплатой больше " + number+ ":");
        for (int i = 0; i < EMPLOYEE.length; i++) {
            if (EMPLOYEE[i].getSalary() > number) {
                System.out.println(EMPLOYEE[i].getId() + " " + EMPLOYEE[i].getName()
                        + " " + EMPLOYEE[i].getSalary());
            }
        }
    }
    }
