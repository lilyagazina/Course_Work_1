
package Course_Work_1;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Employee list1 = new Employee("Аверина Анастасия Викторовна", 1, 68900);
        Employee list2 = new Employee("Курочкина Любовь Александровна", 2, 60900);
        Employee list3 = new Employee("Медведев Максим Дмитриевич", 2, 62900);
        Employee list4 = new Employee("Смирнов Дмитрий Андреевич", 3, 58900);
        Employee list5 = new Employee("Икусова Яна Александровна", 3, 55900);
        Employee list6 = new Employee("Шашкин Алексей Алексеевич", 4, 48900);
        Employee list7 = new Employee("Гуров Александр Викторович", 4, 52900);
        Employee list8 = new Employee("Любавина Мария Валерьевна", 5, 45600);
        Employee list9 = new Employee("Нагаева Диана Алельшаевна", 5, 47300);
        Employee list10 = new Employee("Дырдин Егор Олегович", 5, 43900);
        employeeBook.addNewEmployee(list1);
        employeeBook.addNewEmployee(list2);
        employeeBook.addNewEmployee(list3);
        employeeBook.addNewEmployee(list4);
        employeeBook.addNewEmployee(list5);
        employeeBook.addNewEmployee(list6);
        employeeBook.addNewEmployee(list7);
        employeeBook.addNewEmployee(list8);
        employeeBook.addNewEmployee(list9);
        employeeBook.addNewEmployee(list10);
        employeeBook.deleteEmployee(5);
        System.out.println("Общие затраты на зарплату в месяц: " + employeeBook.countTotalMonthlySalary());
        System.out.println("Сотрудник с максимальной заплатой " + employeeBook.countEmployeeMaxSalary());
        System.out.println("Сотрудник с минимальной заплатой " + employeeBook.countEmployeeMinSalary());
        System.out.println("Средняя сумма трат за месяц составила " + employeeBook.countAverageSalary() + " рублей");
        employeeBook.printName();
        int indexPercent = 2;
        employeeBook.indexSalary(2);
        System.out.printf("Проиндексированна зарплата на %d%%%n", indexPercent);
        employeeBook.listPrint();
        int department = 2;
        System.out.println("Сотрудник с максимальной заплатой из отдела " + department + ": "
                + employeeBook.countEmployeeDepMaxSalary(department));
        System.out.println("Сотрудник с минимальной заплатой из отдела " + department + ": "
                + employeeBook.countEmployeeDepMinSalary(department));
        System.out.println("Сумма затрат на зарплату по отделу " + department + ": "
                + employeeBook.departmentalPayrollCosts(department));
        System.out.println("Средняя зарплата по отделу " + department + ": "
                + employeeBook.averageSalaryDepartment(department));
        employeeBook.printNameSalary(department);
        employeeBook.indexDepSalary(indexPercent, department);
        System.out.printf("Проиндексированна зарплата на %d%%%n", indexPercent);
        employeeBook.printNameSalary(department);
        int number = 80000;
        employeeBook.moreNumber(number);
        employeeBook.lessNumber(number);
        System.out.println("-----------------------------------------");
        employeeBook.listPrint();
        employeeBook.changeSalaryDep("Гуров Александр Викторович", 1,89000);
        employeeBook.listPrint();
        employeeBook.printEmployeesByDepartment();


    }
}




