import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class Animal {

	public Animal() {
	    
	}

	protected int currentHunger;
	protected int howSleepy;
	protected int howHappy;
	protected boolean alive;
	protected String name;
	protected String mood;
	protected String type;
	protected String state;
	
	Animal(String newname)
	{
		currentHunger = 0;
		howSleepy = 0;
		howHappy = 100;
		alive = true;
		name = newname;
		mood = "Happy";
		type = "Dark_Demon_of_Hell";
		state = "idle";
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
        state = "eating";
        Lib.write("Nomnomnom!");
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
    
    public String getType()
    {
    	return type;
    }
    
    public String getFullStats()
    {
    	String text = "Name: " + name + "\nMood: " + mood + "\nSleepylevel: " + howSleepy + "\nHungrylevel: " + howSleepy + "\nHappylevel: " + howHappy;
    	return text;
    }
    
    public String getState()
    {
    	return state;
    }
    
    public void kill()
    {
    	alive = false;
    	state = "dead";
    	Lib.write(name + " died... :(");
    }
    
    public void play()
    {
    	increaseSleepy(20);
    	increaseHappy(50);
    	increaseHunger(20);
    	Lib.write(name + ":Yaaay");
    }
    
    public void sleep()
    {
    	decreaseSleepy(50);
    	increaseHappy(10);
    	increaseHunger(10);
    	Lib.write(name + ":ZZZzzzz....");
    }
    
    public void checkLife()
    {
    	if(currentHunger >= 100)
    	{
    		alive = false;
    		Lib.write("R.I.P " + name);
    	}
    	if(howSleepy >= 100)
    	{
    		alive = false;
    		Lib.write("R.I.P " + name);
    	}
    	
    	decreaseHappy(currentHunger / 2);
    	decreaseHappy(howSleepy / 2);
    	if(howHappy <= 0)
    	{
    		alive = false;
    		Lib.write("R.I.P " + name);
    	}
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
    
    //
    public void colorFeature() {
    	JFrame window01 = new JFrame("Window with a choice option");
	    window01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    final JButton button = new JButton("Please, choose a clolor.");

	    ActionListener actionListener = new ActionListener() {
	      public void actionPerformed(ActionEvent actionEvent) {
	        Color initialBackground = button.getBackground();
	        Color background = JColorChooser.showDialog(null, "Hello! Please choose a color for the button.",
	            initialBackground);
	        if (background != null) {
	          button.setBackground(background);
	        }
	      }
	    };
	    button.addActionListener(actionListener);
	    
	    window01.add(button, BorderLayout.CENTER);
	    window01.setSize(300, 100);
	    window01.setVisible(true);
    }

}
