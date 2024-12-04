public class EmployeeBook {
    private static final int MAX_EMPLOYEES = 10;
    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[MAX_EMPLOYEES];
    }

    // Добавляем нового сотрудника
    public boolean addEmployee(String name, double salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(name, salary, department);
                return true;
            }
        }
        return false;
    }

    // Удаляем сотрудника по id
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    // Получаем сотрудника по id
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    // Получаем список всех сотрудников
    public Employee[] getAllEmployees() {
        return employees;
    }

    // Считаем сумму затрат на ЗП
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

    // Находим сотрудника с максимальной ЗП
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

    // Считаем среднее значение зарплат
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

    // Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
    public void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    // Вопрос: Получить в качестве параметра номер отдела (1-5) и найти:
    // 1. Сотрудника с минимальной зп;
    public Employee findEmployeeWithMinSalaryInDepartment(int department) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    // 2. Сотрудника с максимальной зп;
    public Employee findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    // 3. Сумму затрат на зп по отделу;
    public double calculateTotalSalaryInDepartment(int department) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    // 4. Среднюю зп по отделу;
    public double calculateAverageSalaryInDepartment(int department) {
        int count = 0;
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
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

    // 5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра;
    public void indexSalaryInDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    // 6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
    public void printEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }

    // Вопрос: Получить в качестве параметра число и вывести:
    // 1. Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
    public void printEmployeesWithSalaryLessThan(double salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
            }
        }
    }

    // 2. Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
    public void printEmployeesWithSalaryGreaterThanOrEqual(double salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
            }
        }
    }
}
