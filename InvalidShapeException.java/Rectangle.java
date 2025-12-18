public class Rectangle  extends Shape{

    protected double width; 
    protected double height; 

    public Rectangle()
    {
        width = 4; 
        height = 5;
    }
    
    public Rectangle(double h, double w)
    {
        width = w; 
        this.height = h;
    }

    public double Area()
    {
        return this.height * this.width;
    }
    
    @Override
    public String describe() {
    return "Rectangle with width " + width + " and height " + height;
    }
}

