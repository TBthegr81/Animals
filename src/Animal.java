
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
	public void setHunger(int hungerValue)
	{
		if(hungerValue <= 100 && hungerValue >= 1)
		{
			currentHunger = hungerValue;
		}
    }
    
	// A setter for sleepyValue
    public void setHowSleepy(int sleepyValue)
    {
    	if(sleepyValue <= 100 && sleepyValue >= 1)
    	{
    		howSleepy = sleepyValue;
    	}
    }
    
    // A setter for happyValue
    public void setHowHappy(int happyValue)
    {
    	if(happyValue <= 100 && happyValue >= 1)
    	{
    		howHappy = happyValue;
    	}
    }
    
    // A setter for howHappy
    public void setHowHappy(int happyValue) {
        howHappy = happyValue;
    }
    
    // Methods to update currentHunger
    public void decreaseHunger(int hungerDecrement) {
        currentHunger -= hungerDecrement;
    }
        
    public void increaseHunger(int hungerIncrement) {
        currentHunger += hungerIncrement;
    }
    
    // Methods to update sleepyValue
    public void decreaseSleepy(int sleepyDecrement) {
        howSleepy -= sleepyDecrement;
    }
     
    public void increaseSleepy(int sleepyIncrement) {
        howSleepy += sleepyIncrement;
    }
    
    // Methods to update howHappy
    public void decreaseHappy(int happyDecrement) {
        howHappy -= happyDecrement;
    }
        
    public void increaseHappy(int happyIncrement) {
        howHappy += happyIncrement;
    }
    // A test comment

}
