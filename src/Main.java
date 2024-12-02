public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        // Добавляем сотрудников
        employeeBook.addEmployee("Дмитрий Попов", 47895);
        employeeBook.addEmployee("Екатерина Стрелкова", 43400);
        employeeBook.addEmployee("Александр Суетин", 55000);
        employeeBook.addEmployee("Станислав Лакиза", 35000);
        employeeBook.addEmployee("Александр Бондаренко", 85000);
        employeeBook.addEmployee("Александр Грушин", 155000);
        employeeBook.addEmployee("Роман Лукин", 45870);
        employeeBook.addEmployee("Юлия Гусельникова", 105000);
        employeeBook.addEmployee("Ольга Гусева", 115896);
        employeeBook.addEmployee("Владимир Плиткин", 45879);

        // Список всех сотрудников
        Employee[] allEmployees = employeeBook.getAllEmployees();
        System.out.println("Список всех сотрудников:");
        for (Employee employee : allEmployees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }

        // Сумма затрат на ЗП
        System.out.println("Сумма затрат на зарплату: " + employeeBook.calculateTotalSalary());

        // Сотрудник с минимальной ЗП
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.findEmployeeWithMinSalary());

        // Сотрудник с максимальной ЗП
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.findEmployeeWithMaxSalary());

        // Среднее значение зарплат
        System.out.println("Среднее значение зарплат: " + employeeBook.calculateAverageSalary());

        // Удаляем сотрудника
        employeeBook.removeEmployee(2);
        System.out.println("Сотрудник с id 2 удален.");

        // Ищем сотрудника по id
        System.out.println("Сотрудник с id 8: " + employeeBook.getEmployeeById(8));
    }
}