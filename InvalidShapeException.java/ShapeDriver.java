import java.util.ArrayList;

public class ShapeDriver {

    public static void main(String[] args) {
        ArrayList<Shape> myShapes = new ArrayList<>();

        myShapes.add(new Circle(3.5f));
        myShapes.add(new Rectangle(4, 6));
        myShapes.add(new Square(5)); 
        
        // Polymorphic loop
        System.out.println("Shape Descriptions (Polymorphism Demo):");
        for (Shape s : myShapes) {
            System.out.println(s.describe()); 
        }

    }
    }