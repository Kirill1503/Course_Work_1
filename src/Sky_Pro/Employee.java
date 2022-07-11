package Sky_Pro;

public class Employee {
    public int department;
    public String name;
    public String lastName;
    public String middleName;
    public int salary;
    public int id;
    private static int counter;

    public Employee (int department, String name, String lastName, String middleName, int salary) {
        this.department = department;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
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
    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }
    public String toString() {
        return "Отдел № " + department + " ФИО: " + lastName + " " + name + " " + middleName + " Заработная плата: " +
                salary + " рублей " + "id номер: " + id;
    }
}
