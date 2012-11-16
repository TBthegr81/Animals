
public class Parrot extends Animal {

	public Parrot(String newname)
	{
		currentHunger = 30;
		howSleepy = 0;
		howHappy = 70;
		mood = "Kinda happy";
		type = "parrot";
	}
	
	public void play()
	{
		state = "flying";
		increaseSleepy(20);
    	increaseHappy(50);
    	increaseHunger(20);
    	Lib.write(name + ":Yaaay");
	}
}
