
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
    
    // Methods to update currentHunger
    public void decreaseHunger(int hungerDecrement) {
        currentHunger -= hungerDecrement;
    }
        
    public void increaseHunger(int hungerIncrement) {
        currentHunger += hungerIncrement;
    }

}
