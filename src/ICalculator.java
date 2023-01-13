
/*
 * @author Sharis Barrios
 */
public interface ICalculator {
    public void on(); 

    public void off(); 

    public boolean isON(); 

    public void setFrequency(String freq) throws Exception;

    public String getFrequency(); 

    public void Forward(); 

    public void Backward();

    public double getFMActualStation();

    public int getAMActualStation();

    public void setFMActualStation (double actualStation); 

    public void setAMActualStation (int actualStation); 

    public void saveFMActualStation (double actualStation, int slot); 
    
    public void saveAMActualStation (int actualStation, int slot);

    public double getFMSlot(int slot); 

    public int getAMSlot(int slot);

}
