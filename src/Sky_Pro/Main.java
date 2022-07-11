import Sky_Pro.Employee;

public class Main {
    public static void allEmployee(Employee[] employees) {
        for (Employee employye :
                employees) {
            System.out.println(employye);
        }
    }

    public static void minSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employye :
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
            for (Employee employye :
                    employees) {
                if (emp.getSalary() < employye.getSalary())
                    emp = employye;
            }
            System.out.println("Сотрудник с максимальной зарплатой: " + emp.getSalary() + " " + emp.getLastName() +
                    " " + emp.getName() + " " + emp.getMiddleName() + " " + emp.getId());
        }
    }

    public static int allSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee :
                employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void averageSalary(Employee[] employees) {
        int sum = allSalary(employees);
        double average = allSalary(employees) / employees.length;
        System.out.println("Средняя зарплата равна " + average);
    }

    public static void countName(Employee[] employees) {
        for (Employee employee :
                employees) {
            System.out.println("Сотрудники компании " + employee.getName());
        }
    }

    public static void main(String[] args) {
        allEmployee(employee);
        minSalary(employee);
        maxSalary(employee);
        System.out.println("Сумма всех затрат равна " + allSalary(employee));
        averageSalary(employee);
        countName(employee);
    }
}