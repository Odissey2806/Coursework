public class EmployeeBook {
    private static final int MAX_EMPLOYEES = 10;
    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[MAX_EMPLOYEES];
    }

    // Добавить нового сотрудника
    public boolean addEmployee(String name, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(name, salary);
                return true;
            }
        }
        return false;
    }

    // Удалить сотрудника по id
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    // Искать сотрудника по id
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    // Список всех сотрудников
    public Employee[] getAllEmployees() {
        return employees;
    }

    // Сумму затрат на ЗП
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    // Находим сотрудника с минимальной ЗП
    public Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    // Найти сотрудника с максимальной ЗП
    public Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    // Подсчитать среднее значение зарплат
    public double calculateAverageSalary() {
        int count = 0;
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                count++;
            }
        }
        if (count > 0) {
            return totalSalary / count;
        } else {
            return 0;
        }
    }
}
