import java.util.Scanner;

public class Calculator {
    public static double computeArea(Point3d a, Point3d b, Point3d c) throws Exception {
        if (a.equals(b) || b.equals(c) || c.equals(a)) {
            throw new Exception("Some points are equal");
        }

        double sideA = a.distanceTo(b);
        double sideB = b.distanceTo(c);
        double sideC = c.distanceTo(a);
        double semiPerimeter = (sideA + sideB + sideC) / 2;

        return Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {


        Point3d a = new Point3d(5, 3, 5);

        Point3d b = new Point3d(4, 5, 0);

        Point3d c = new Point3d(2, -1, 1);

        try {
            System.out.println("Площадь: " + computeArea(a, b, c));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
