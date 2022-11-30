public class Main {
    public final static Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Рейх Дариян Сергеевич", 1, 60000);
        EMPLOYEES[1] = new Employee("Филиппов Николй Сергеевич", 2, 53000);
        EMPLOYEES[2] = new Employee("Кукалов Виталий Сергеевич", 3, 54800);
        EMPLOYEES[3] = new Employee("Кукалов Тимофей Сергеевич", 4, 50500);
        EMPLOYEES[4] = new Employee("Купчев Алексей Сергеевич", 5, 53300);
        EMPLOYEES[5] = new Employee("Саблин Виктор Сергеевич", 2, 51200);
        EMPLOYEES[6] = new Employee("Селехов Андрей Сергеевич", 3, 55800);
        EMPLOYEES[7] = new Employee("Мартынов Роман Сергеевич", 4, 54300);
        EMPLOYEES[8] = new Employee("Игнатьев Максим Сергеевич", 1, 58000);
        EMPLOYEES[9] = new Employee("Стружук Иосиф Сергеевич", 5, 55000);
        fullInfo();
        System.out.println("Вся зарплата " + salary());
        System.out.println("Минимальная ЗП сотрудника " + minimumSalary());
        System.out.println("Максимальная ЗП сотрудника " + maxSalary());
        System.out.println("Средня ЗП сотрудника " + findSalary());
        fullInfoName();


    }

    private static void fullInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int salary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum = sum + employee.getEmployeeSalary();
        }
        return sum;

    }

    private static Employee minimumSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeWithMinimumSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getEmployeeSalary() < min) {
                min = employee.getEmployeeSalary();
                employeeWithMinimumSalary = employee;
            }

        }
        return employeeWithMinimumSalary;


    }

    private static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getEmployeeSalary() > max) {
                max = employee.getEmployeeSalary();
                employeeWithMaxSalary = employee;
            }

        }
        return employeeWithMaxSalary;


    }

    private static double findSalary() {

        return (double) salary() / EMPLOYEES.length;

    }
    private static void fullInfoName() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }
}