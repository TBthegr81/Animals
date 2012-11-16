
public class Animal {

	private int currentHunger;
	private int howSleepy;
	private int howHappy;
	private boolean alive;
	private String name;
	private String mood;
	
	Animal(String newname)
	{
		currentHunger = 0;
		howSleepy = 0;
		howHappy = 100;
		alive = true;
		name = newname;
		mood = "Happy";
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
    
    public String getHappyText()
    {
    	if(howHappy < 10)
        {
        	mood = "Very angry!";
        }
        else if(howHappy >= 10 && howHappy < 30)
        {
        	mood = "Kinda angry...";
        }
        else if(howHappy >= 30 && howHappy < 50)
        {
        	mood = "Not very happy.";
        }
        else if(howHappy >= 50 && howHappy < 70)
        {
        	mood = "Kinda happy...";
        }
        else if(howHappy >= 70 && howHappy < 90)
        {
        	mood = "Very happy!";
        }
        else if(howHappy == 100)
        {
        	mood = "Extacy!";
        }
    	return mood;
    }
    public String getName()
    {
    	return name;
    }
    
    public String getFullStats()
    {
    	String text = "Name: " + name + "\nMood: " + mood + "\nSleepylevel: " + howSleepy + "\nHungrylevel: " + howSleepy;
    	return text;
    }
    
    public void kill()
    {
    	alive = false;
    	Lib.write(name + " died... :(");
    }

}
