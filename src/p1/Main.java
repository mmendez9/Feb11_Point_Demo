package p1;

import javafx.geometry.Point2D;

public class Main {

    public static void main(String[] args) {
        Point2D pt1 = new Point2D(3, 0);
        Point2D pt2 = new Point2D(0, 4);
        double hypotenuse = pt1.distance(pt2);

        System.out.println(pt1);
        System.out.println(pt2);
        System.out.printf("Hypotenuse = %.2f%n", hypotenuse);
    }
}
