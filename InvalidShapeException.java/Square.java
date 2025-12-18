public class Square extends Rectangle {

    public Square()
    {
        height = 4;
        width = 4;
    }
    public Square(int w)
    {
        super(w,w);
    }
    @Override
    public String describe() {
    return "Square with side length " + width;
    }
}

