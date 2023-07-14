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
        int x = scanner.nextInt();
        System.out.println("Podaj y:");
        int y = scanner.nextInt();
        return new Point(x, y);
    }

    private String getCoordinateInfo(Point point) {
        if (point.getX() == 0) {
            if (point.getY() == 0) {
                return "Punkt (0, 0) leży na środku układu współrzędnych";
            } else {
                return String.format("Punkt (0, %d) leży na osi Y", point.getY());
            }
        } else if (point.getY() == 0) {
            return String.format("Punkt (%d, 0) leży na osi X", point.getX());
        } else {
            return getQuarterInfo(point);
        }
    }

    private String getQuarterInfo(Point point) {
        String quarter;
        if (point.getX() > 0) {
            if (point.getY() > 0) {
                quarter = "I";
            } else {
                quarter = "IV";
            }
        } else {
            if (point.getY() > 0) {
                quarter = "II";
            } else {
                quarter = "III";
            }
        }
        return String.format("Punkt (%d, %d) leży w %s ćwiartce układu współrzędnych",
                point.getX(), point.getY(), quarter);
    }
}
