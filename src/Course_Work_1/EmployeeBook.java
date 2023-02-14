package Course_Work_1;

public class EmployeeBook {
    private final Employee[] employees;
    private static final int SIZE = 10;

    public EmployeeBook() {
        this.employees = new Employee[SIZE];
    }

    //Базовый уровень

    public void listPrint() { // распечатывает список
        System.out.println("Все сотрудники: ");
        for (Employee employee1 : employees) {
            System.out.println(employee1);
        }
    }

    public int countTotalMonthlySalary() { //считает общую сумму затрат на зарплаты за месяц
        int sum = 0;
        //for (int i = 0; i < employees.length; i++)
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee countEmployeeMaxSalary() { //вычесляет сотрудника с максимальной зарплатой
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() > max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    public Employee countEmployeeMinSalary() { //вычесляет сотрудника с минимальной зарплатой
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    public double countAverageSalary() { //считает среднюю зарплату за месяц
        return countTotalMonthlySalary() / (double) employees.length;
    }

    public void printName() { //Ф.И.О. сотрудников
        System.out.println("Ф.И.О. сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    //Повышенная сложность
    public void indexSalary(int indexPercent) { //индексирует зарплаты
        for (Employee employee : employees) {
            if (employee != null)
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * indexPercent));
        }
    }

    public Employee countEmployeeDepMaxSalary(int department) {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() > max && emp.getDepartment() == department) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    public Employee countEmployeeDepMinSalary(int department) {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() < min && emp.getDepartment() == department) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    public double departmentalPayrollCosts(int department) { //сумма зарплат 1 отдела
        double salary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                salary += employees[i].getSalary();
            }
        }
        return salary;
    }

    public double averageSalaryDepartment(int department) { //Средняя зарплата по 1 отделу
        int sumEmpDep = 0;
        int salary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                salary += employees[i].getSalary();
                sumEmpDep++;
            }
        }
        if (sumEmpDep != 0) {
            return salary / (double) sumEmpDep;
        } else {
            return 0;
        }

    }

    public void indexDepSalary(int indexPercent, int department) { //индексирует зарплаты отдела
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() / 100 * indexPercent));
            }
        }
    }

    public void printNameSalary(int department) {
        //распечатать всех сотрудников отдела (все данные, кроме отдела)
        System.out.println("Сотрудники отдела: " + department);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public void lessNumber(int number) {
        // поиска всех сотрудников с зарплатой меньше определенного числа
        System.out.println("Сотрудники с зарплатой меньше " + number + ":");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < number) {
                System.out.println(employees[i].getId() + " " + employees[i].getName()
                        + " " + employees[i].getSalary());
            }
        }
    }

    public void moreNumber(int number) {
        // поиска всех сотрудников с зарплатой больше определенного числа
        System.out.println("Сотрудники с зарплатой больше " + number + ":");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > number) {
                System.out.println(employees[i].getId() + " " + employees[i].getName()
                        + " " + employees[i].getSalary());
            }
        }
    }

    //Очень сложно
    public void addNewEmployee(Employee employee) {
        // Добавить нового сотрудника
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }

        }
    }

    public void deleteEmployee(String name) {
        //Удалить сотрудника по имени
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                employees[i] = null;
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        //Удалить сотрудника по id
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public Employee getEmployeeName(String name) {
        //получить сотрудника по имени
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public void changeSalaryDep(String name, int newDepartment, int newSalary) {
        //изменить отдел и зарплату у полученного сотрудника
        Employee employee = getEmployeeName(name);
        if (employees != null) {
            employee.setDepartment(newDepartment);
            employee.setSalary(newSalary);
        }
    }

    public void printEmployeesByDepartment() {
        for (int department = 1; department <= 5; department++) {
            System.out.println("Сотрудники отдела: " + department);
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment() == department) {
                    System.out.println(employee);

                }
            }

        }
    }
}
