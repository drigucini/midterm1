public class Main {

    public static long spentOnSalariesThisMonth(Employee employee[]) {
        long overallSalaries = 0;
        for (int i = 0; i < employee.length; i++) {
            overallSalaries += employee[i].getSalary();
        }
        return overallSalaries;

    }

    public static long findMaxSalary (Employee employee[]) {
        long maxSalary = -1;
        for (int i = 0; i < employee.length; i++ ) {
            long currentSalary = employee[i].getSalary();
            if (currentSalary > maxSalary) {
                maxSalary = currentSalary;
            } else {
                maxSalary = maxSalary;
            }
        }
        return maxSalary;
    }

    public static long findMinSalary(Employee employee[]) {
        long minSalary = 999_999;
        for (int i = 0; i < employee.length; i++ ) {
            long currentSalary = employee[i].getSalary();
            if (currentSalary > minSalary) {
                minSalary = minSalary;
            } else {
                minSalary = currentSalary;
            }
        }
        return minSalary;
    }

    public static long findAverageSalary(Employee employee[]) {
        long overallSalary = spentOnSalariesThisMonth(employee);
        long averageSalary = overallSalary/employee.length;
        return averageSalary;
    }

    public static void printAllEmployees(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            //Employee id++;
            System.out.println(employee[i]);
        }
    }

    public static void printAllNames(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            //Employee id++;
            int id = i + 1;
            System.out.println("Employee №" + id + " " + employee[i].getFullName());
        }
    }



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
        System.out.println(minSalary);

        //count overall salary expenditures this month method check
        long overallSalaries = spentOnSalariesThisMonth(employee);
        System.out.println(overallSalaries);

        //find max salary method check
        long maxSalary = findMaxSalary(employee);
        System.out.println(maxSalary);

        //find average salary method check
        long averageSalary = findAverageSalary(employee);
        System.out.println(averageSalary);

        //check print names method
        printAllNames(employee);
    }
}