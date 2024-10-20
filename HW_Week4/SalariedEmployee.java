class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double fixedSalary;

    public SalariedEmployee(int employeeId, String name, String socialSecurityNumber, double fixedSalary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedSalary = fixedSalary;
    }

    // Getters and Setters
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary; // Fixed salary for salaried employees
    }
}
