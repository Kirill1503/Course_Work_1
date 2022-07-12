package Sky_Pro;

public class Book {
    public Employee[] employee = {
            new Employee(1, "Ivan", "Ivanov", "Ivanovich", 88000.03),
            new Employee(1, "Alexandr", "Alexandrov", "Alexandrovich", 75000.75),
            new Employee(2, "Petr", "Petrov","Petrovich", 70000.81),
            new Employee(2, "Nikita", "Nikitin", "Nikityevich", 97000.90),
            new Employee(3, "Alexey", "Alexeev", "Alexeevich", 83000.77),
            new Employee(3, "Semen", "Semenov", "Semenovich", 40000.33),
            new Employee(4, "Roman", "Romanov", "Romanovich", 71000.98),
            new Employee(4, "Kirill", "Kirillov", "Kirillovich", 99000.73),
            new Employee(5, "Maxim", "Maximov", "Maximovich", 40000.64),
            new Employee(5, "Ignat", "Ignatov", "Ignatovich", 76000.01),
    };
    int size;
    public void add(int department, String name, String lastName, String middleName, int salary) {
        Employee employees = new Employee(department, name, lastName, middleName, salary);
        employee[size++] = employees;
        if (size > employee.length) {
            System.out.println("Ошибка!!!");
        }
    }

    public void allEmployee() {
        for (int i = 0; i < employee.length; i++) {
                System.out.println(employee[i]);
            }
        }

    public void minSalary() {
        if (employee.length > 0) {
            Employee emp = employee[0];
            for (Employee employee :
                    employee) {
                if (emp.getSalary() > employee.getSalary())
                    emp = employee;
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + emp.getSalary() + " " + emp.getLastName() +
                    " " + emp.getName() + " " + emp.getMiddleName() + " " + emp.getId());
        }
    }

    public void maxSalary() {
        if (employee.length > 0) {
            Employee emp = employee[0];
            for (Employee employee :
                    employee) {
                if (emp.getSalary() < employee.getSalary())
                    emp = employee;
            }
            System.out.println("Сотрудник с максимальной зарплатой: " + emp.getSalary() + " " + emp.getLastName() +
                    " " + emp.getName() + " " + emp.getMiddleName() + " " + emp.getId());
        }
    }

    public double allSalary() {
        double sum = 0;
        for (Employee employee :
                employee) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public void averageSalary() {
        double average = allSalary() / employee.length;
        System.out.println("Средняя зарплата равна " + average);
    }

    public void countName() {
        for (Employee employee :
                employee) {
            System.out.println("Сотрудники компании " + employee.getName());
        }
    }
}
