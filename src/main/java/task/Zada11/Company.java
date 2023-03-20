package task.Zada11;

import java.util.Scanner;

public class Company {
    Scanner scanner = new Scanner(System.in);
    private final static int MAX_PERSON = 3;
    Employee[] employees = new Employee[MAX_PERSON];
    int change;

    public Employee newEmployee() {
        if (change < MAX_PERSON) {
            System.out.println("Give me your name");
            String firstName = scanner.nextLine();
            System.out.println("Give me your lastName");
            String lastName = scanner.nextLine();
            System.out.println("What is your salary");
            double salary = scanner.nextDouble();
            change++;
            return new Employee(firstName, lastName, salary);
        } else {
            System.out.println("No more space");
        }
        return null;
    }

    public void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}



