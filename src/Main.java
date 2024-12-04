public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иван Иванов", 50000, 1);
        employeeBook.addEmployee("Мария Петрова", 60000, 2);
        employeeBook.addEmployee("Алексей Сидоров", 55000, 1);
        employeeBook.addEmployee("Елена Козлова", 52000, 3);
        employeeBook.addEmployee("Дмитрий Морозов", 58000, 2);
        employeeBook.addEmployee("Ольга Васильева", 53000, 1);
        employeeBook.addEmployee("Сергей Николаев", 57000, 3);
        employeeBook.addEmployee("Анна Михайлова", 54000, 2);
        employeeBook.addEmployee("Павел Соколов", 56000, 1);
        employeeBook.addEmployee("Татьяна Лебедева", 59000, 3);

        // Индексируем зарплату на 10%
        employeeBook.indexSalary(10);

        // Выводим сотрудников с зарплатой меньше 55000
        System.out.println("Сотрудники с зарплатой меньше 55000:");
        employeeBook.printEmployeesWithSalaryLessThan(55000);

        // Выводим сотрудников с зарплатой больше или равно 55000
        System.out.println("Сотрудники с зарплатой больше или равно 55000:");
        employeeBook.printEmployeesWithSalaryGreaterThanOrEqual(55000);

        // Выводим сотрудников в отделе 1
        System.out.println("Сотрудники в отделе 1:");
        employeeBook.printEmployeesInDepartment(1);

        // Находим сотрудника с минимальной зарплатой в отделе 1
        System.out.println("Сотрудник с минимальной зарплатой в отделе 1: " + employeeBook.findEmployeeWithMinSalaryInDepartment(1));

        // Находим сотрудника с максимальной зарплатой в отделе 1
        System.out.println("Сотрудник с максимальной зарплатой в отделе 1: " + employeeBook.findEmployeeWithMaxSalaryInDepartment(1));

        // Вычисляем сумму затрат на зарплату в отделе 1
        System.out.println("Сумма затрат на зарплату в отделе 1: " + employeeBook.calculateTotalSalaryInDepartment(1));

        // Вычисляем среднюю зарплату в отделе 1
        System.out.println("Средняя зарплата в отделе 1: " + employeeBook.calculateAverageSalaryInDepartment(1));

        // Индексируем зарплату в отделе 1 на 5%
        employeeBook.indexSalaryInDepartment(1, 5);
    }
}