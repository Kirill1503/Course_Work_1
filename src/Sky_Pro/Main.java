package Sky_Pro;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.minSalary();
        book.maxSalary();
        System.out.println("Сумма всех затрат равна " + book.allSalary());
        book.averageSalary();
        book.countName();
        book.allEmployee();
    }
}