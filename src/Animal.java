
public class Animal {

	int currentHunger = 0;
	int howSleepy = 0;
	int howHappy = 100;
	
	// A setter for hungerValue
	public void setHunger(int hungerValue) {
        currentHunger = hungerValue;
    }
    
	// A setter for sleepyValue
    public void setHowSleepy(int sleepyValue) {
        howSleepy = sleepyValue;
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

}
