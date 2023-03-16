package task.Zada2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    Scanner scanner = new Scanner(System.in);

    public void closeScanner() {
        scanner.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj informacje o prostokącie.");
        System.out.println("Podaj długość boku A:");
        double a = scanner.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = scanner.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Podaj informacje o kole.");
        System.out.println("Podaj długość promienia:");
        double r = scanner.nextDouble();

        return new Circle(r);
    }

    private Triangle readTriangleData() {
        System.out.println("Podaj informacje o trójkat.");
        System.out.println("Podaj długość boku A:");
        double a = scanner.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = scanner.nextDouble();
        System.out.println("Podaj długość boku C:");
        double c = scanner.nextDouble();
        System.out.println("Podaj wysokość:");
        double h = scanner.nextDouble();

        return new Triangle(a, b, c, h);
    }

    public Shape createShape() {
        int option = scanner.nextInt();
        switch (option) {
            case Shape.RECTANGLE:
             return    readRectangleData();
            case Shape.CIRCLE:
              return   readCircleData();
            case Shape.TRIANGLE:
               return readTriangleData();
            default:
                throw new NoSuchElementException("Brak podanego krzształtu");
        }
    }
    public void clearBuffer() {
        scanner.nextLine();
    }
}
