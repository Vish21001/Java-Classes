public class Battery
{
    static double voltage;
    static double totalVoltage;
    static int numOfBatteries;
    
    
    public Battery(double voltage)
    {
        this.voltage = voltage;
        numOfBatteries++;
        totalVoltage = voltage + totalVoltage;
    }
    
    public double getVoltage()
    {
        return voltage;
    }
    
    public double getTotalVolatge()
    {
        return totalVoltage;
    }
    
    public int getNumOfBatteries()
    {
        return numOfBatteries;
    }
}
