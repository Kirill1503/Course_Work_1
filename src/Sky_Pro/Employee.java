package Sky_Pro;

public class Employee {
    private int department;
    private String name;
    private String lastName;
    private String middleName;
    private int salary;
    private int id;
    private static int counter;

    public Employee(int department, String name, String lastName, String middleName, int salary) {
        this.department = department;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.id = counter++;
    }

    private int getDepartment() {
        return department;
    }

    private void setDepartment(int department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Отдел № " + department + " ФИО: " + lastName + " " + name + " " + middleName + " Заработная плата: " +
                salary + " рублей " + "id номер: " + id;
    }
}
