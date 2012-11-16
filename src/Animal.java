
public class Animal {

	int currentHunger;
	int howSleepy;
	int howHappy;
	
	Animal()
	{
		currentHunger = 0;
		howSleepy = 0;
		howHappy = 100;
	}
	
	// A setter for hungerValue
	public void SetHunger(int hungerValue)
	{
		if(hungerValue <= 100 && hungerValue >= 1)
		{
			currentHunger = hungerValue;
		}
    }
    
	// A setter for sleepyValue
    public void SetHowSleepy(int sleepyValue)
    {
    	if(sleepyValue <= 100 && sleepyValue >= 1)
    	{
    		howSleepy = sleepyValue;
    	}
    }
    
    // A setter for happyValue
    public void SetHowHappy(int happyValue)
    {
    	if(happyValue <= 100 && happyValue >= 1)
    	{
    		howHappy = happyValue;
    	}
    }
    
    // Methods to update currentHunger
    public void DecreaseHunger(int hungerDecrement) {
        currentHunger -= hungerDecrement;
    }
        
    public void IncreaseHunger(int hungerIncrement) {
        currentHunger += hungerIncrement;
    }
    
    // Methods to update sleepyValue
    public void DecreaseSleepy(int sleepyDecrement) {
        howSleepy -= sleepyDecrement;
    }
     
    public void IncreaseSleepy(int sleepyIncrement) {
        howSleepy += sleepyIncrement;
    }
    
    // Methods to update howHappy
    public void DecreaseHappy(int happyDecrement) {
        howHappy -= happyDecrement;
    }
        
    public void IncreaseHappy(int happyIncrement) {
        howHappy += happyIncrement;
    }
    // A test comment

}
