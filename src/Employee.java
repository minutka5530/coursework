public class Employee {
    private static int idGenerator = 1;
    final private int id;
    final private String fullName;
    private int department;
    private int employeeSalary;

    public Employee(String fullName, int department, int employeeSalary) {
        this.fullName = fullName;
        this.department = department;
        this.employeeSalary = employeeSalary;
        this.id = idGenerator++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", ФИО: " + fullName + '\'' +
                ", Отдел: " + department +
                ", Зарплата: " + employeeSalary;
    }
}
