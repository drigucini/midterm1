public class Main {
    static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        System.out.println("\nMidterm 1, 31.01.2023");
        employees[0] = new Employee("John Smith", 1, 100_000);
        employees[1] = new Employee("Tracy Smith", 3, 200_000);
        employees[2] = new Employee("Anna Kraft", 5, 300_000);
        employees[3] = new Employee("Luise Montpelier", 3, 10_000);
        employees[4] = new Employee("Abraham Kennedy", 4, 12_000);
        employees[5] = new Employee("Zu Tzu", 2, 100_500);
        employees[6] = new Employee("Fernandez Lao", 1, 110_500);
        employees[7] = new Employee("Lyubov Koroleva ", 2, 70_000);
        employees[8] = new Employee("Ivan Drozdov", 1, 750_000);
        employees[9] = new Employee("Sergey Smirnoff", 5, 90_000);

        //check print method
        printAllEmployees(employees);

        //find min salary method check
        System.out.println("\nfind min salary method check");
        long minSalary = findMinSalary();
        System.out.println("The lowest salary is " + minSalary);

        //count overall salary expenditures this month method check
        System.out.println("\nFind overall salary expenditures method check");
        long overallSalaries = spentOnSalariesThisMonth();
        System.out.println("Overall salary expenditures this month will be " + overallSalaries);

        //find max salary method check
        System.out.println("\nFind max salary method check");
        long maxSalary = findMaxSalary();
        System.out.println("The biggest salary is " + maxSalary);

        //find average salary method check
        System.out.println("\nFind average salary method check");
        double averageSalary = findAverageSalary();
        System.out.println("Average salary is " + averageSalary + "\n");

        //check print names method
        System.out.println("\nPrint all employees method check");
        printAllNames(employees);

        //index salaries check method
        System.out.println("\nindex salaries check method");
        Employee[] indexedEmployees = indexSalaries(employees, 15);
        printAllEmployees(indexedEmployees);

        //find min salary by department method checker
        findMinSalaryByDepartment(employees,3);

        System.out.println("\nDepartment method check");
        Employee[] employeeDep1 = getEmployeesByDepartment(employees, 1);
        printAllEmployees(employeeDep1);
        getEmployeesByDepartment(employees, 1);


    }



    public static long spentOnSalariesThisMonth() {
        long overallSalaries = 0;
        for (Employee employee: employees) {
            overallSalaries += employee.getSalary();
        }
        return overallSalaries;

    }

    public static long findMaxSalary () {
        long maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            long currentSalary = employee.getSalary();
            if (currentSalary > maxSalary) {
                maxSalary = currentSalary;
            }
        }
        return maxSalary;
    }

    public static long findMinSalary() {
        long minSalary = employees[0].getSalary();
        for (Employee value : employees) {
            long currentSalary = value.getSalary();
            minSalary = Math.min(currentSalary, minSalary);
        }
        return minSalary;
    }

    public static double findAverageSalary() {
        long overallSalary = spentOnSalariesThisMonth();
        return (double) overallSalary/employees.length;
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printAllNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Employee №" + employee.getIdNumber() + ": " + employee.getFullName());
        }
    }

    public static Employee[] indexSalaries(Employee[] employees, int index) {
        for (Employee employee: employees) {
            long indexedSalary = employee.getSalary() + index*employee.getSalary()/100;
            employee.setSalary(indexedSalary);
        }
        return employees;
    }

    public static Employee findMinSalaryByDepartment(Employee[] employees, int department) {
        Employee[] employeesByDepartment = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                employeesByDepartment[i] = employees[i];
            }
        }
        return employeesByDepartment[1];
    }

    private static Employee[] getEmployeesByDepartment(Employee[] employees, int department) {
        int arraySize = 0;
        for (int b = 0; b < employees.length; b++) {
            if (employees[b].getDepartment() == department) {
                arraySize++;
            }
        }
        Employee[] employeesByDepartment = new Employee[arraySize];
        for (int a = 0; a < employeesByDepartment.length; a++) {
            for (int c = 0; c < employees.length; c++) {
                if (employees[c].getDepartment() == department) {
                    employeesByDepartment[a] = employees[c];
                }
            }
        }
        return employeesByDepartment;
    }
}