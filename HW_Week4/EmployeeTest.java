public class EmployeeTest {
    public static void main(String[] args) {
        // Create an array of employees
        Employee[] employees = new Employee[4];

        // Add salaried employees
        employees[0] = new SalariedEmployee(1, "Andryi Andrievskyi", "123-45-6789", 4000.00);
        employees[1] = new SalariedEmployee(2, "Eugen Eugenchenko", "987-65-4321", 3000.00);

        // Add contract employees
        employees[2] = new ContractEmployee(3, "Mykyta Mykytenko", "CE-123456", 20.00, 160); // 160 hours
        employees[3] = new ContractEmployee(4, "Mariya Mashenko", "CE-654321", 15.00, 100); // 150 hours

        // Print employee details and payment
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId() +
                    ", Name: " + employee.getName() +
                    ", Average Monthly Wage: " + employee.calculatePay());
        }
    }
}

