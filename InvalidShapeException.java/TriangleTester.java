public class TriangleTester {

    public static void main(String[] args) throws InvalidShapeException {
        
        Triangle defaultTriangle = new Triangle();
        if (Math.abs(defaultTriangle.getSide1() - 3) < 0.001 &&  Math.abs(defaultTriangle.getSide2() - 4) < 0.001 &&  Math.abs(defaultTriangle.getSide3() - 5) < 0.001 )
            System.out.println("Default triangle constructor passed. ");
        else 
            System.out.println("Default constructor failed");

        try{
            Triangle failedTriangle = new Triangle(2, 3, 15);
            System.out.println("Bad triangle created, so test failed");
        }
        catch (InvalidShapeException e) {
            System.out.println("Bad triangle threw exception, so test passed.");
        }

        try {
            Triangle myTriangle = new Triangle(6, 8 , 10);
            System.out.println("Good Triangle created with parameterized constructor, so test passed.");
        } catch (InvalidShapeException e) {
            System.out.println("Good triangle thre an exception, so test failed");
        }

        defaultTriangle.setSide1(4);
        defaultTriangle.setSide2(5);
        defaultTriangle.setSide3(3);

        if (Math.abs(defaultTriangle.getSide1() - 4) > 0.001)
            System.out.println("setSide1 failed");
        else 
            System.out.println("setSide1 passed");

        if (Math.abs(defaultTriangle.getSide2() - 5) > 0.001)
            System.out.println("setSide2 failed");
        else 
            System.out.println("setSide2 passed");

            if (Math.abs(defaultTriangle.getSide3() - 3) > 0.001)
            System.out.println("setSide3 failed");
        else 
            System.out.println("setSide3 passed");

        try {
            defaultTriangle.setSide1(25);
            System.out.println("The setter for side 1 invalid triangle failed. ");
        } catch (InvalidShapeException e) {
            System.out.println("The setter for side 1 invalid triangle passed. ");
        }
        try {
            defaultTriangle.setSide2(25);
            System.out.println("The setter for side 2 invalid triangle failed. ");
        } catch (InvalidShapeException e) {
            System.out.println("The setter for side 2 invalid triangle passed. ");
        }
        try {
            defaultTriangle.setSide3(25);
            System.out.println("The setter for side 3 invalid triangle failed. ");
        } catch (InvalidShapeException e) {
            System.out.println("The setter for side 3 invalid triangle passed. ");
        }

        double defaultTriangleArea = defaultTriangle.Area();
        if (Math.abs(defaultTriangleArea - 6) > 0.001)
            System.out.println("Area method failed, area is " + defaultTriangleArea);
        else   
            System.out.println("Area method passed, area is " + defaultTriangleArea);

        double defaultTrianglePerimter = defaultTriangle.Perimeter();
        if (Math.abs(defaultTrianglePerimter -12) > 0.001)
            System.out.println("Perimeter method failed, permieter is " + defaultTrianglePerimter);
        else    
            System.out.println("Perimeter method passed, permieter is " + defaultTrianglePerimter);

        int defaultTrianglePosition = defaultTriangle.getPosition();
        System.out.println("The position of the default triangle is " + defaultTrianglePosition);

        int failedMoveCounter = 0; 
        int timestoMove = 50000000; 

        long endTime = 0 ; 
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < timestoMove; i++)
        {
            defaultTriangle.Move();
            if (defaultTrianglePosition == defaultTriangle.getPosition())
            {
                System.out.println("Move test failed.");
                failedMoveCounter++;
            }
            defaultTrianglePosition = defaultTriangle.getPosition();

        }
        endTime = System.currentTimeMillis();

        System.out.println("Move method failed " + failedMoveCounter + " times. For " + timestoMove + 
            " iterations of the test. The test took " + (endTime - startTime)/1000.0 + " seconds.");


            

    }
    
}

