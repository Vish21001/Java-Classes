public class Cat 
{
    private String breed;
    private String name;
    // Add an instance variable here for name.
    
    public Cat(String theBreed, String theName)
    {
        breed = theBreed;
        name = theName;
    }
    
    public String toString()
    {
        return name + " is a " + breed;
    }
}
