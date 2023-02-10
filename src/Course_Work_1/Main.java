package Course_Work_1;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Аверина Анастасия Викторовна", 1, 68900);
        employee[1] = new Employee("Курочкина Любовь Александровна", 2, 60900);
        employee[2] = new Employee("Медведев Максим Дмитриевич", 2, 62900);
        employee[3] = new Employee("Смирнов Дмитрий Андреевич", 3, 58900);
        employee[4] = new Employee("Икусова Яна Александровна", 3, 55900);
        employee[5] = new Employee("Шашкин Алексей Алексеевич", 4, 48900);
        employee[6] = new Employee("Гуров Александр Викторович", 4, 52900);
        employee[7] = new Employee("Любавина Мария Валерьевна", 5, 45600);
        employee[8] = new Employee("Нагаева Диана Алельшаевна", 5, 47300);
        employee[9] = new Employee("Дырдин Егор Олегович", 5, 43900);

        Employee.listPrint(employee);
        TotalSalary.counterTotalMonthlySalary(employee);
        MaxSalary.counterEmployeeMaxSalary(employee);
        MinSalary.counterEmployeeMinSalary(employee);
        AverageSalary.counterAverageSalary(employee);

    }
}