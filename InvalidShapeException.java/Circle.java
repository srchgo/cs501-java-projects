public class Circle extends Shape{

    float radius;
    public Circle()
    {
        radius = 0;
    }

    public Circle(float r)
    {
        radius = r;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float r) {
        radius = r;
    }

    public float getDiameter() {
        return radius * 2;
    }


    public double Area()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    @Override
    public String describe() {
    return "Circle with radius " + radius;
    }
}

