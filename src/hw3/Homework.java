import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Иванов Иван Иванович", 18, 50000, "Отдел разработки"));
        employees.add(new Employee("Петров Петр Петрович", 35, 10000, "Отдел бухгалтерии"));
        employees.add(new Employee("Гангиев Сигизмунд Альбертович", 20, 15000, "Отдел разработки"));
        employees.add(new Employee("Чивыркин Акакий Акакиевич", 19, 25500, "Отдел кадров"));
        employees.add(new Employee("Джавистый Анатолий Павлович", 27, 15000, "Отдел АХО"));
        employees.add(new Employee("Сишарпный Валентин Германович", 45, 75000, "Администрация"));
        employees.add(new Employee("Массивов Андрей Анатольевич", 32, 30000, "Отдел кадров"));
        employees.add(new Employee("Списочный Павел Геннадьевич", 35, 80000, "Администрация"));
        employees.add(new Employee("Забавнофамильный Емельян Альбертович", 50, 15000, "Отдел разработки"));

        Collections.sort(employees);

        for(var employee : employees) {
            System.out.println(employee);
        }

        System.out.println();

        employees.sort(new AgeComparator());

        for(var employee : employees) {
            System.out.println(employee);
        }

        System.out.println();

        employees.sort(new SalaryComparator());

        for(var employee : employees) {
            System.out.println(employee);
        }

    }
}
