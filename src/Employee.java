public class Employee {
    private String fullName;
    private int department;
    private long salary;
    private static int id;

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

}
