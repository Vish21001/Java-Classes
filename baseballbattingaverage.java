public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    private double battingAverage;
    
    public BaseballPlayer(String theName, int theHits, int theAtBats)
    {
        name = theName;
        hits = theHits;
        atBats = theAtBats;
        battingAverage = (double)hits / (double)atBats;

    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
    
    public double getBattingAverage()
    {
        return battingAverage;
    }
}
