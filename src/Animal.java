import javax.swing.JOptionPane;


public class Animal {
	public Animal() {
		
	}

	private int currentHunger;
	private int howSleepy;
	private int howHappy;
	private boolean alive;
	private String name;
	
	Animal(String newname)
	{
		currentHunger = 0;
		howSleepy = 0;
		howHappy = 100;
		alive = true;
		name = newname;
	}
	
	// A getter for currentHunger
	public int getCurrentHunger() {
		return currentHunger;
	}
	
	// A getter for howSleepy
	public int getHowSleepy() {
		return howSleepy;
	}
	
	// A getter for howHappy
	public int getHowHappy() {
		return howHappy;
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
    
    public void kill()
    {
    	alive = false;
    	Lib.write(name + " died... :(");
    }
    
    // A method that may get a message and present it in a box
    public void fYIBox(String messege) {
 	    JOptionPane.showMessageDialog(
 	    null,
        messege,
        "For Your Information Box",
 	    JOptionPane.INFORMATION_MESSAGE);
    }
    
    // A method that may present something someone says in a box
    public void speaking(String someWords) {
 	    JOptionPane.showMessageDialog(
 	    null,
        someWords,
        name + " is saying:",
 	    JOptionPane.INFORMATION_MESSAGE);
    }

}
