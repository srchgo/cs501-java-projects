public class CircleTester {
    public static void main(String[] args) {
        Circle c = new Circle(5.0f);

        if (Math.abs(c.getRadius() - 5.0f) < 0.001)
            System.out.println("getRadius() test passed");
        else
            System.out.println("getRadius() test failed");

        c.setRadius(7.0f);
        if (Math.abs(c.getRadius() - 7.0f) < 0.001)
            System.out.println("setRadius() test passed");
        else
            System.out.println("setRadius() test failed");

        double expectedArea = Math.PI * 7.0f * 7.0f;
        if (Math.abs(c.Area() - expectedArea) < 0.001)
            System.out.println("area() test passed");
        else
            System.out.println("area() test failed");

        if (Math.abs(c.getDiameter() - 14.0f) < 0.001)
            System.out.println("getDiameter() test passed");
        else
            System.out.println("getDiameter() test failed");
    }
}
