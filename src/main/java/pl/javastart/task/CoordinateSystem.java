package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        Point point = getPointFromUser(scanner);
        System.out.println(getCoordinateInfo(point));
    }

    private Point getPointFromUser(Scanner scanner) {
        System.out.println("Podaj x:");
        double x = scanner.nextDouble();
        System.out.println("Podaj y:");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }

    private String getCoordinateInfo(Point point) {
        if(point.getX() == 0) {
            if(point.getY() == 0)
                return "Punkt (0, 0) leży na środku układu współrzędnych";
            else
                return String.format("Punkt (0, %.1f) leży na osi Y", point.getY());
        }
        else if(point.getY() == 0) {
            return String.format("Punkt (%.1f, 0) leży na osi X", point.getX());
        }
        else
            return getQuarterInfo(point);
    }

    private String getQuarterInfo(Point point) {
        if(point.getX() > 0) {
            if(point.getY() > 0)
                return String.format("Punkt (%.1f, %.1f) leży w I ćwiartce układu współrzędnych",
                        point.getX(), point.getY());
            else
                return String.format("Punkt (%.1f, %.1f) leży w IV ćwiartce układu współrzędnych",
                        point.getX(), point.getY());
        }
        else {
            if(point.getY() > 0)
                return String.format("Punkt (%.1f, %.1f) leży w II ćwiartce układu współrzędnych",
                        point.getX(), point.getY());
            else
                return String.format("Punkt (%.1f, %.1f) leży w III ćwiartce układu współrzędnych",
                        point.getX(), point.getY());
        }
    }
}
