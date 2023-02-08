public class Main {

    public static void main(String[] args) {
        System.out.println("\nMidterm 1, 31.01.2023");
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("John Smith", 1, 100_000);
        employee[1] = new Employee("Tracy Smith", 3, 200_000);
        employee[2] = new Employee("Anna Kraft", 5, 300_000);
        employee[3] = new Employee("Luise Montpelier", 3, 10_000);
        employee[4] = new Employee("Abraham Kennedy", 4, 12_000);
        employee[5] = new Employee("Zu Tzu", 2, 100_500);
        employee[6] = new Employee("Fernandez Lao", 1, 110_500);
        employee[7] = new Employee("Lyubov Koroleva ", 2, 70_000);
        employee[8] = new Employee("Ivan Drozdov", 1, 750_000);
        employee[9] = new Employee("Sergey Smirnoff", 5, 90_000);

        //check print method
        printAllEmployees(employee);

        //find min salary method check
        long minSalary = findMinSalary(employee);
        System.out.println("\nThe lowest salary is " + minSalary);

        //count overall salary expenditures this month method check
        long overallSalaries = spentOnSalariesThisMonth(employee);
        System.out.println("Overall salary expenditures this month will be " + overallSalaries);

        //find max salary method check
        long maxSalary = findMaxSalary(employee);
        System.out.println("The biggest salary is " + maxSalary);

        //find average salary method check
        double averageSalary = findAverageSalary(employee);
        System.out.println("Average salary is " + averageSalary + "\n");

        //check print names method
        printAllNames(employee);
    }
    public static long spentOnSalariesThisMonth(Employee[] employees) {
        long overallSalaries = 0;
        for (Employee employee: employees) {
            overallSalaries += employee.getSalary();
        }
        return overallSalaries;

    }

    public static long findMaxSalary (Employee[] employees) {
        long maxSalary = -1;
        for (Employee employee : employees) {
            long currentSalary = employee.getSalary();
            if (currentSalary > maxSalary) {
                maxSalary = currentSalary;
            }
        }
        return maxSalary;
    }

    public static long findMinSalary(Employee[] employee) {
        long minSalary = 999_999;
        for (Employee value : employee) {
            long currentSalary = value.getSalary();
            minSalary = Math.min(currentSalary, minSalary);
        }
        return minSalary;
    }

    public static double findAverageSalary(Employee[] employees) {
        long overallSalary = spentOnSalariesThisMonth(employees);
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
}