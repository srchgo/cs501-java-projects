public class Triangle extends Shape{

    private double side1; 
    private double side2; 
    private double side3; 

    public Triangle()
    {
        this.side1 = 3; 
        side2 = 4;
        side3 = 5;
    }

    public Triangle (double s1, double s2, double s3) throws InvalidShapeException
    {
        side1 = s1; 
        side2 = s2;
        side3 = s3;
        if (!isATriangle(s1, s2, s3))
            throw new InvalidShapeException("These three side lengths cannot form a triangle.");
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return this.side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public void setSide1(double s1) throws InvalidShapeException
    { 
        if (!isATriangle(s1, side2, side3))
            throw new InvalidShapeException("These three side lengths cannot form a triangle.");
        side1 = s1;
    }

    public void setSide2(double s2) throws InvalidShapeException
    {
        if (!isATriangle(side1, s2, side3))
            throw new InvalidShapeException("These three side lengths cannot form a triangle.");
        this.side2 = s2;
    }

    public void setSide3 (double s3) throws InvalidShapeException
    {
        if (!isATriangle(side1, side2, s3))
            throw new InvalidShapeException("These three side lengths cannot form a triangle.");
        this.side3 = s3;
    }

    public double Area()
    {
        double s = (this.side1 + this.side2 + this.side3 )/2;
        return Math.round(Math.sqrt(s * (s-this.side1)* (s-this.side2)* (s-this.side3) ));
    }
    private boolean isATriangle(double s1, double s2, double s3)
    {
        return !(s1 + s2 < s3 || s1 + s3 < s2 || s2 + s3 < s1);
        
    }

    public double Perimeter()
    {
        return this.side1 + this.side2 + this.side3; 
    }

    @Override
    public String describe() {
    return "Triangle with sides " + side1 + ", " + side2 + ", " + side3;
    }
    
}

