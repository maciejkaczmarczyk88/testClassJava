package task.Zada7;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        int numberX = 10;
        int numberY = 10;
        Scanner sc = new Scanner(System.in);
        PointController pc = new PointController();
        Point point = new Point(numberX, numberY);
        System.out.println("Take symbol +, -, *, /");
        String sign = sc.nextLine();
        Point point1;

        switch (sign){
            case "+":
               point1 = pc.addX(point);
                break;
            case "-":
               point1 = pc.addY(point);
                break;
            case "*":
                point1 =pc.minusX(point);
                break;
            case "/":
                point1 = pc.minusY(point);
            default:
                System.out.println("wrong sing");
            }
        System.out.println(point.getPointX() + point.getPointY());
        }


    }

