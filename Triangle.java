public class Triangle
{
    private int width;
    private int height;
    private double area;
    
    public Triangle(int triwidth, int triheight)
    {
        width = triwidth;
        height = triheight;
        area = (width * height) / 2;
    }
    
    public double getArea()
    {
        return area;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
}
