import java.util.Random;

abstract class Shape{
    public abstract String describe();
    private int position; 
    abstract double Area();

    public Shape()
    {
        Random myRandom = new Random();
        position = myRandom.nextInt(99) + 1;
    }

    public int getPosition()
    {
        return this.position;
    }

    final public void Move()
    {
        Random myRandom = new Random();
        int r = myRandom.nextInt(6) - 3;
        if (r == 0) {
            r = 1; 
        }
    
        position += r;
    }

    public void Resize()
    {
        return;
    }

    
  
}

