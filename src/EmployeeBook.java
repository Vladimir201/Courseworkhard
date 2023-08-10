public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public EmployeeBook() {

        employees[0] = new Employee("Иванов Иван Иванович", 2, 45000);
        employees[1] = new Employee("Семенов Семен Семенович", 3, 46000);
        employees[2] = new Employee("Сергеев Сергей Сергеевич", 1, 47000);
        employees[3] = new Employee("Юрьев Юрий Юрьевич", 4, 48000);
        employees[4] = new Employee("Поликарпов Поликарп Поликарпович ", 4, 49000);
        employees[5] = new Employee("Степанов Степан Степанович", 3, 50000);
        employees[6] = new Employee("Лактионов Локоть Локтевич", 5, 51000);
        employees[7] = new Employee("Федотов Федот Федотович", 4, 69000);
        employees[8] = new Employee("Дмитров Дмитрий Дмитриевич", 3, 72000);
        employees[9] = new Employee("Иванов Иван Иванович", 1, 30000);
    }

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void remove(long id) {
        for (int i = 0, employeesLength = employees.length; i < employeesLength; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    private Employee findByFullName(String fullName) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getFullName().equalsIgnoreCase(fullName)) {
                return employee;
            }
        }
        return null;
    }

    public void changeSalary(String fullName, double newSalary) {
        Employee employee = findByFullName(fullName);
        if (employee != null) {
            employee.setSalary(newSalary);
        }
    }

    public void changeDepartment(String fullName, int newDepartment) {
        Employee employee = findByFullName(fullName);
        if (employee != null) {
            employee.setDepartment(newDepartment);
        }
    }


    public void printAll() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public void printAll(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }

    public double salarySum() {
        double salary = 0.0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            salary += employee.getSalary();
        }
        return salary;
    }

    public double salarySum(int department) {
        double salary = 0.0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                salary += employee.getSalary();
            }
        }
        return salary;
    }

    public Employee findMin() {
        Employee minEmployy = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (minEmployy == null || employee.getSalary() < minEmployy.getSalary()) {
                minEmployy = employee;
            }
        }
        return minEmployy;
    }

    public Employee findMin(int department) {
        Employee minEmployy = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            if (minEmployy == null || employee.getSalary() < minEmployy.getSalary()) {
                minEmployy = employee;
            }
        }
        return minEmployy;
    }

    public Employee findMax() {
        Employee maxEmloyy = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (maxEmloyy == null || employee.getSalary() > maxEmloyy.getSalary()) {
                maxEmloyy = employee;
            }
        }
        return maxEmloyy;
    }

    public Employee findMax(int department) {
        Employee maxEmloyy = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            if (maxEmloyy == null || employee.getSalary() > maxEmloyy.getSalary()) {
                maxEmloyy = employee;
            }
        }
        return maxEmloyy;
    }

    public double getAverage() {
        double sum = 0.0;
        int quantity = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
            quantity++;
        }
        return sum / quantity;
    }

    public double getAverage(int department) {
        double sum = 0.0;
        int quantity = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            sum += employee.getSalary();
            quantity++;
        }
        return sum / quantity;
    }

    public void printFullName() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }

    public void printFullName(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }

    public void raiseSalary(int percent) {
        double koef = 1 + percent / 100.0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalary(employee.getSalary() * koef);
        }
    }

    public void raiseSalary(int percent, int department) {
        double koef = 1 + percent / 100.0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            employee.setSalary(employee.getSalary() * koef);
        }
    }

    public void printAllWithSalaryLess(double salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }

    public void printAllWithSalaryMore(double salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > salary) {
                System.out.println(employee);
            }
        }
    }
}
