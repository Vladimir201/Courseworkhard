public class Main {
    public static void main(String[] args) {


        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAll(3);
        System.out.println(employeeBook.salarySum(3));
        employeeBook.add(new Employee("Cazonof Dohya Avtor", 1, 0.0001));
        employeeBook.printAll();
    }
}