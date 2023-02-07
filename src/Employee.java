import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private long salary;
    private static int id = 0;

    public Employee(String fullName, int department, long salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }
    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public long getSalary() {
        return this.salary;
    }

    public void setDepartment(int Department) {
        this.department = department;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee №" + id +
                "\nFull name: " + fullName +
                ", department #" + department +
                ", salary " + salary +
                " roubles";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }
}
