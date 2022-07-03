import Sky_Pro.Employee;

public class Main {
    public static void allEmployee(Employee[] employees) {
        for (Employee employye:
             employees) {
            System.out.println(employye);
        }
    }
    public static void minSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employye:
                 employees) {
            if (emp.getSalary() > employye.getSalary())
                emp = employye;
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + emp.getSalary() + " " + emp.getLastName() +
                   " " + emp.getName() + " " + emp.getMiddleName() + " " + emp.getId());
        }
    }
    public static void maxSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employye:
                 employees) {
            if (emp.getSalary() < employye.getSalary())
                emp = employye;
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + emp.getSalary() + " " + emp.getLastName() +
                   " " + emp.getName() + " " + emp.getMiddleName() + " " + emp.getId());
        }
    }

    public static int allSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee:
             employees)
        { sum += employee.getSalary();}
        System.out.println("Сумма всех зарплат равна " + sum);
        return sum;
    }

    public static void averageSalary(Employee[] employees) {
        int sum = allSalary(employees);
        int average = sum/ employees.length;
        System.out.println("Сумма всех зарплат равна " + average);
    }

    public static void countName(Employee[] employees) {
        for (Employee employee:
             employees) {
            System.out.println("Сотрудники компании " + employee.getName());
        }
    }
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee(1, "Ivan", "Ivanov",
                "Ivanovich", 65000);
        employee[1] = new Employee(1, "Alexandr", "Alexandrov",
                "Alexandrovich", 75000);
        employee[2] = new Employee(2, "Petr", "Petrov",
                "Petrovich", 70000);
        employee[3] = new Employee(2, "Nikita", "Nikitin",
                "Nikityevich", 97000);
        employee[4] = new Employee(3, "Alexey", "Alexeev",
                "Alexeevich", 83000);
        employee[5] = new Employee(3, "Semen", "Semenov",
                "Semenovich", 40000);
        employee[6] = new Employee(4, "Roman", "Romanov",
                "Romanovich", 71000);
        employee[7] = new Employee(4, "Kirill", "Kirillov",
                "Kirillovich", 99000);
        employee[8] = new Employee(5, "Maxim", "Maximov",
                "Maximovich", 40000);
        employee[9] = new Employee(5, "Ignat", "Ignatov",
                "Ignatovich", 76000);

        allEmployee(employee);
        minSalary(employee);
        maxSalary(employee);
        allSalary(employee);
        averageSalary(employee);
        countName(employee);
    }
}