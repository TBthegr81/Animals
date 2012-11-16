
public class Parrot extends Animal {

	public Parrot(String newname)
	{
		currentHunger = 30;
		howSleepy = 0;
		howHappy = 70;
		alive = true;
		name = newname;
		mood = "Kinda happy";
		type = "parrot";
		state = "idle";
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
