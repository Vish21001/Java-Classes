public class TShirt extends Clothing
{
    public String size;
    public String color;
    public String fabric;
    
    public TShirt(String size, String color, String fabric)
    {
        super(size, color);
        this.fabric = fabric;
    }

    public String getFabric()
    {
        return fabric;
    }
}
