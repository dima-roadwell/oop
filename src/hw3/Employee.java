public class Employee implements Comparable<Employee> {
    public String name;
    public int age;
    public int salary;
    public String departmentName;

    public Employee(String name, int age, int salary, String departmentName) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    @Override
    public String toString()
    {
        return String.format("\nName: %s, Age: %d, Salary: %d, Department name: %s", name, age, salary, departmentName);
    }

    @Override
    public int compareTo(Employee o)
    {
        return this.departmentName.compareToIgnoreCase(o.departmentName);
    }
}
